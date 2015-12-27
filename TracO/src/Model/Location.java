package Model;

public class Location {
	
	private String Country;
	private String City;
	private String Station; //Airport,Train staion
	private String Name; //BGU,LGU..
	
	public Location(String Country, String City, String Station, String Name) {
		super();
		this.Country = Country;
		this.City = City;
		this.Station = Station;
		this.Name = Name;
	}
	
	public String getCountry() {
		return Country;
	}
	
	public void setCountry(String country) {
		this.Country = country;
	}
	
	public String getCity() {
		return City;
	}
	
	public void setCity(String city) {
		this.City = city;
	}
	
	public String getStation() {
		return Station;
	}
	
	public void setStation(String station) {
		this.Station = station;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
