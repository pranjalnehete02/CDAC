package fi.ticketrestapp.entity;

import java.sql.Date;

import fi.ticketrestapp.enums.Category;
import fi.ticketrestapp.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tickets")
public class Ticket {
	
	@Id
	@Column(name="ticketid")
	int ticketId; 
	
	@Column(name ="requesterphnnum")
	String requesterPhnNum;
	
	@Enumerated(EnumType.STRING)
	@Column(name="category")
	Category category;
	
	@Column(name = "issuedetails")
	String issueDetails;
	
	@Column(name="resolutiondetails")
	String resolutionDetails;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	Status status;

	@Column(name="creationdatetime")
	Date creationDateTime;
	
	@Column(name="resolutiondatetime")
	Date resolutionDateTime;

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getRequesterPhnNum() {
		return requesterPhnNum;
	}

	public void setRequesterPhnNum(String requesterPhnNum) {
		this.requesterPhnNum = requesterPhnNum;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getIssueDetails() {
		return issueDetails;
	}

	public void setIssueDetails(String issueDetails) {
		this.issueDetails = issueDetails;
	}

	public String getResolutionDetails() {
		return resolutionDetails;
	}

	public void setResolutionDetails(String resolutionDetails) {
		this.resolutionDetails = resolutionDetails;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(Date creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public Date getResolutionDateTime() {
		return resolutionDateTime;
	}

	public void setResolutionDateTime(Date resolutionDateTime) {
		this.resolutionDateTime = resolutionDateTime;
	}
	
	
}
