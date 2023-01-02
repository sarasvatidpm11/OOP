package id.ac.undiksha.siak.entities;

public class Lecturer {
	private String nip;
	private String name;
	private String address;
	private boolean gender; //0 is female and 1 is male
	private String studyProgram;
	private String position;
	private String department;
	private String faculty;
	
	public Lecturer() {
		this.nip			= "<invalid nim>";
		this.name			= "<invalid name>";
		this.address		= "<invalid address>";
//		this.gender			= "<valid gender>";
		this.studyProgram	= "<invalid study program>";
		this.position		= "<invalid position>";
		this.department		= "<invalid department>";
		this.faculty		= "<invalid faculty>";
	}
	
	public Lecturer(String nip, String name, String address, boolean gender, String studyProgram, String position, String department,
			String faculty) {
		super();
		this.nip = nip;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.studyProgram = studyProgram;
		this.position = position;
		this.department = department;
		this.faculty = faculty;
	}

	public void printAllInfo() {
		System.out.println("NIP : " + this.nip);
		System.out.println("Name : " + this.name);
		System.out.println("Address : " + this.address);
		System.out.println("Gender : " + (gender ? "Male" : "Female"));
		System.out.println("Study Program : " + this.studyProgram);
		System.out.println("Position : " + this.position);
		System.out.println("Department : " + this.department);
		System.out.println("Faculty : " + this.faculty);
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getNip() {
		return nip;
	}

	public void setNim(String nip) {
		this.nip = nip;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getStudyProgram() {
		return studyProgram;
	}

	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public void setPosition(String position){
		this.position = position;
	}
}
