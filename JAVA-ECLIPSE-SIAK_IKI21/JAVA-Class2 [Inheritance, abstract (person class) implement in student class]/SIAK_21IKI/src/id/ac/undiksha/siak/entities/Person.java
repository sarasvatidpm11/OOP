package id.ac.undiksha.siak.entities;

public class Person {
	private String name;
	private String address;
	private boolean gender; //0 is female and 1 is male
	
	public Person() {
		this.name			= "<invalid name>";
		this.address		= "<invalid address>";
	}
	
	public Person(String name, String address, boolean gender) {
		super();
		this.name = name;
		this.address = address;
		this.gender = gender;
	}

	public void printAllInfo() {
		System.out.println("Name : " + this.name);
		System.out.println("Address : " + this.address);
		System.out.println("Gender : " + (gender ? "Male" : "Female"));
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean getGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
