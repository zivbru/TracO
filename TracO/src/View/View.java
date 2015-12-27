package View;

import java.util.List;

import Model.Trip;

public interface View {
	
	public List<Trip> compareTrips(List<Trip> trip);
	public void getMapForTrip(List<Trip> trip);

}
