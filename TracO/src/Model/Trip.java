package Model;

import java.util.ArrayList;
import java.util.List;

public class Trip {
	
	private List <Ticket> tickets = new ArrayList<Ticket>();
	
	private float totalPrice;
	
	private String resultid;//foreign key

	
	
	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getResultid() {
		return resultid;
	}

	public void setResultid(String resultid) {
		this.resultid = resultid;
	}

	
	
}
