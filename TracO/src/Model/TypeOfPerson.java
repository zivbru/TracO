package Model;

public class TypeOfPerson {
	
	private String typeOfPerson;//student/baby
	private int age;
	private int numOfPersons;
	
	public TypeOfPerson(String typeOfPerson, int age, int numOfPersons) {
		super();
		this.typeOfPerson = typeOfPerson;
		this.age = age;
		this.numOfPersons = numOfPersons;
	}
	
	public String getTypeOfPerson() {
		return typeOfPerson;
	}
	
	public void setTypeOfPerson(String typeOfPerson) {
		this.typeOfPerson = typeOfPerson;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getNumOfPersons() {
		return numOfPersons;
	}
	
	public void setNumOfPersons(int numOfPersons) {
		this.numOfPersons = numOfPersons;
	}
	
	

}
