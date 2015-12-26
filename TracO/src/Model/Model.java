package Model;

import java.util.Date;
import java.util.List;

public interface Model {

	public Result getResult(Search s);//search
	
	public List<Ticket> getTickets(Date depart, Location src);
	
	public List<Ticket> getTickets(Date depart,Date arrival, Location src);
	
	public List<Ticket> getTickets(Date depart,Date arrival, Location src, Location dest);
	
	public List<Trip> getTrips(String resulId);//???
	
	public List<Trip> getTrips();
	
	
	
	
	
	
	
}
