package fi.ticketrestapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fi.ticketrestapp.dto.TicketDTO;
import fi.ticketrestapp.entity.Ticket;
import fi.ticketrestapp.enums.Status;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

	@Query(nativeQuery = true,value = "SELECT * FROM tickets WHERE status = :status")
	public List<Ticket> findByStatus(Status status);
}
