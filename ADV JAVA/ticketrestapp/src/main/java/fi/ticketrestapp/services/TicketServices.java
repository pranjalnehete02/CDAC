package fi.ticketrestapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fi.ticketrestapp.dto.TicketDTO;

@Service
public interface TicketServices {

	public boolean createNewTicket(TicketDTO newTicket);
	public TicketDTO fetchTicketById(int ticketId);
	public boolean updateTicketDetails(int ticketId);
	public List<TicketDTO> fetchAllOpenTickets();
}
