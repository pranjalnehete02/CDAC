package fi.ticketrestapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fi.ticketrestapp.dto.TicketDTO;
import fi.ticketrestapp.services.TicketServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	TicketServices ticketServices;
	
	@PostMapping("/createNewTicket")
	public boolean createNewTicket(@RequestBody TicketDTO dto) {
		return ticketServices.createNewTicket(dto);
	}
	
	@GetMapping("/getTicketDetails/{tid}")
	public TicketDTO getTicketDetails(@PathVariable("tid") int tid) {
		return ticketServices.fetchTicketById(tid);
	}
	
	@GetMapping("/allOpenTickets")
	public List<TicketDTO> getAllOpenTickets() {
		return ticketServices.fetchAllOpenTickets();
	}
	
}
