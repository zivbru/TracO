package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ticket {
	
	private String type; // Train or Airplane (enum)
	private String ticketId;
	private String tripId; //foreign key
	private Date depart;
	private Date arrival;
	private SimpleDateFormat hourDepart;
	private SimpleDateFormat hourArrival;
	private Location src;
	private Location dest;
	private float price;
	private String company;
		
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Ticket() {}
	
	public Ticket(String type, String ticketId, String tripId, Date depart,
			Date arrival, SimpleDateFormat hourDepart,
			SimpleDateFormat hourArrival, Location src, Location dest,
			float price,String company, String TypeOfTravel) {
		super();
		this.type = type;
		this.ticketId = ticketId;
		this.tripId = tripId;
		this.depart = depart;
		this.arrival = arrival;
		this.hourDepart = hourDepart;
		this.hourArrival = hourArrival;
		this.src = src;
		this.dest = dest;
		this.price = price;
		this.company=company;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getTripId() {
		return tripId;
	}
	public void setTripId(String tripId) {
		this.tripId = tripId;
	}
	public Date getDepart() {
		return depart;
	}
	public void setDepart(Date depart) {
		this.depart = depart;
	}
	public Date getArrival() {
		return arrival;
	}
	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}
	public SimpleDateFormat getHourDepart() {
		return hourDepart;
	}
	public void setHourDepart(SimpleDateFormat hourDepart) {
		this.hourDepart = hourDepart;
	}
	public SimpleDateFormat getHourArrival() {
		return hourArrival;
	}
	public void setHourArrival(SimpleDateFormat hourArrival) {
		this.hourArrival = hourArrival;
	}
	public Location getSrc() {
		return src;
	}
	public void setSrc(Location src) {
		this.src = src;
	}
	public Location getDest() {
		return dest;
	}
	public void setDest(Location dest) {
		this.dest = dest;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
