package Model;

import java.util.ArrayList;
import java.util.List;

public class Trip {
	
	private String TripId;
	private List <Ticket> Tickets = new ArrayList<Ticket>();
	private float TotalPrice;
	private String Resultid;//foreign key
	
	public List<Ticket> getTickets() {
		return Tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.Tickets = tickets;
	}

	public float getTotalPrice() {
		return TotalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.TotalPrice = totalPrice;
	}

	public String getResultid() {
		return Resultid;
	}

	public void setResultid(String resultid) {
		this.Resultid = resultid;
	}

	public String getTripId() {
		return TripId;
	}

	public void setTripId(String tripId) {
		TripId = tripId;
	}
}
