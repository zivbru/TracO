package Model;

import java.util.Date;
import java.util.List;

public interface Model {

	public Result getResult(Search s); //Search
	
	public List<Ticket> getTickets(Date depart, Location src);
	
	public List<Ticket> getTickets(Date depart,Date arrival, Location src);
	
	public List<Ticket> getTickets(Date depart,Date arrival, Location src, Location dest);
	
	public List<Trip> getTrips(String resulId); //???
	
	public List<Trip> getTrips();
	
	public List<Trip> sortTrip(Result r, String parmas);//Sort by params
	
	public List<Trip> filterTrip(Result r, String parmas);
	
	public List<Trip> getPopularDest();
	
	public float getPriceByCurrency(String currencyType);
	
	///public List<Trip> getXML();
}
