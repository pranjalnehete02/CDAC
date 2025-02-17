package fi.ticketrestapp.dto;

import java.sql.Date;

import fi.ticketrestapp.enums.Category;
import fi.ticketrestapp.enums.Status;

public class TicketDTO {

	int ticketId; 
	
	String requesterPhnNum;
	
	Category category;
	
	String issueDetails;
	
	String resolutionDetails;
	
	Status status;

	Date creationDateTime;
	
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
