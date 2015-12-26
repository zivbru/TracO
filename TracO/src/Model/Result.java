package Model;

import java.util.ArrayList;
import java.util.List;

public class Result {
	
	private List<Trip> trips =new ArrayList<Trip>();
	private int resultId;
	private String searchId;//foreign key
	
	
	
	public Result(List<Trip> trips, int resultId, String searchId) {
	
		this.trips = trips;
		this.resultId = resultId;
		this.searchId = searchId;
	}

	public List<Trip> getTrips() {
		return trips;
	}
	
	public void setTrips(List<Trip> trips) {
		this.trips = trips;
	}
	
	public int getResultId() {
		return resultId;
	}
	
	public void setResultId(int resultId) {
		this.resultId = resultId;
	}
	
	public String getSearchId() {
		return searchId;
	}
	
	public void setSearchId(String searchId) {
		this.searchId = searchId;
	}
	
	

}
