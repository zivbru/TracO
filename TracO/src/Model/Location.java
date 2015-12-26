package Model;

public class Location {
	
	private String country;
	private String city;
	private String station;//airport//trainstaion
	
	public Location(String country, String city, String station) {
		super();
		this.country = country;
		this.city = city;
		this.station = station;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getStation() {
		return station;
	}
	
	public void setStation(String station) {
		this.station = station;
	}
	
	
	
	

}
