package fi.ticketrestapp.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fi.ticketrestapp.dto.TicketDTO;
import fi.ticketrestapp.entity.Ticket;
import fi.ticketrestapp.enums.Status;
import fi.ticketrestapp.repository.TicketRepository;

@Service
public class TicketServicesImpl implements TicketServices {

	@Autowired
	TicketRepository ticketRepo;
	
	@Override
	public boolean createNewTicket(TicketDTO newTicket) {
		
		Ticket entityTicket = new Ticket();
		BeanUtils.copyProperties(newTicket, entityTicket);
		entityTicket.setCreationDateTime(new java.sql.Date(new Date().getTime()));
		entityTicket.setStatus(Status.OPEN);
		ticketRepo.save(entityTicket);
		return true;
	}

	@Override
	public TicketDTO fetchTicketById(int ticketId) {
		
		Ticket entityticket = ticketRepo.findById(ticketId).get();
		TicketDTO dto = new TicketDTO();
		BeanUtils.copyProperties(entityticket, dto);
		return dto;
	}

	@Override
	public boolean updateTicketDetails(int ticketId) {
		return false;
	}

	@Override
	public List<TicketDTO> fetchAllOpenTickets() {

		List<Ticket> openTicketList = ticketRepo.findByStatus(Status.OPEN);
		
		ArrayList<TicketDTO> dtoList = new ArrayList<TicketDTO>();
		for(Ticket ticket : openTicketList) {
			
			TicketDTO dto = new TicketDTO();
			BeanUtils.copyProperties(ticket, dto);
			dtoList.add(dto);
		}
		return dtoList;
	}

}
