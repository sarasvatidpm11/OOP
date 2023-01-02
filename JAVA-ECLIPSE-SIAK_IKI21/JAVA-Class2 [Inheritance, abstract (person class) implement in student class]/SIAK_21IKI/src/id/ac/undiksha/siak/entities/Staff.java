package id.ac.undiksha.siak.entities;

public class Staff extends Person{
	private String nip;
	private String unit;
	
	public Staff() {
		super();
		this.nip			= "<invalid nim>";
		this.unit			= "<invalid unit>";
	}
	
	public Staff(String nip, String name, String address, boolean gender, String unit) {
		super(name, address, gender);
		this.nip = nip;
		this.unit = unit;
	}

	public void printAllInfo() {
		System.out.println("NIP : " + this.nip);
		System.out.println("Name : " + getName());
		System.out.println("Address : " + getAddress());
		System.out.println("Gender : " + (getGender() ? "Male" : "Female"));
		System.out.println("Unit : " + this.unit);
		
	}
	
	
	public String getNip() {
		return nip;
	}

	public void setNim(String nip) {
		this.nip = nip;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}
