package Model;

import java.util.Date;

public class Search {
	
	private String searchId;
	private String typeOfTransport; // Train or Airplane
	private Date departDate;
	private Date returnDate;
	private Location src;
	private Location dest;
	private TypeOfPerson Person;
	private TypeOfClass classType;
	private String typeOfFlight; // Oneway or Roundtrip
	
	public Search() {}
	
	public Search(String searchId, String typeOfTransport, Date departDate,
			Date returnDate, Location src, Location dest, TypeOfPerson person,
			TypeOfClass classType, String typeOfFlight) {
		super();
		this.searchId = searchId;
		this.typeOfTransport = typeOfTransport;
		this.departDate = departDate;
		this.returnDate = returnDate;
		this.src = src;
		this.dest = dest;
		Person = person;
		this.classType = classType;
		this.typeOfFlight = typeOfFlight;
	}
	public String getSearchId() {
		return searchId;
	}
	public void setSearchId(String searchId) {
		this.searchId = searchId;
	}
	public String getTypeOfTransport() {
		return typeOfTransport;
	}
	public void setTypeOfTransport(String typeOfTransport) {
		this.typeOfTransport = typeOfTransport;
	}
	public Date getDepartDate() {
		return departDate;
	}
	public void setDepartDate(Date departDate) {
		this.departDate = departDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
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
	public TypeOfPerson getPerson() {
		return Person;
	}
	public void setPerson(TypeOfPerson person) {
		Person = person;
	}
	public TypeOfClass getClassType() {
		return classType;
	}
	public void setClassType(TypeOfClass classType) {
		this.classType = classType;
	}
	public String getTypeOfFlight() {
		return typeOfFlight;
	}
	public void setTypeOfFlight(String typeOfFlight) {
		this.typeOfFlight = typeOfFlight;
	}
	
	
	
	

}
