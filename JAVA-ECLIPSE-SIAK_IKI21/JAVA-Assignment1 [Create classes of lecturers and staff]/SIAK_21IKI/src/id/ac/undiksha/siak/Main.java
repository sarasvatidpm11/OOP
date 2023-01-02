package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Student;
import id.ac.undiksha.siak.entities.Lecturer;
import id.ac.undiksha.siak.entities.Staff;

public class Main {//we can't an object

	public static void main(String[] args) { //static = we don't need an object to make a class
		// TODO Auto-generated method stub
		
		Student std1 = new Student();
		std1.setNim ("2115101002"); 
		std1.setName ("Kim Taehyung"); 
		std1.setAddress("Seoul");
		std1.setGender(true);
		std1.setStudyProgram("Computer Science");
		std1.setDepartment("TI");
		std1.setFaculty("Tecnical and Vocational");
		
		Student std2 = new Student ("2115101001", "Desak Saraswati", "Jln. Samratulangi No.14", false, "Computer Science", "TI", "Tecnical and Vocational");
		
		std2.printAllInfo();
		
		System.out.println(" ");
		
		std1.printAllInfo();
		
		System.out.println(" ");
		
		Lecturer lec1 = new Lecturer ("199906222015041003", "Yudhi Paramartha", "Singaraja", true, "Computer Science", "Koorprodi", "TI", "Tecnical and Vocational");
		
		lec1.printAllInfo();
		
		System.out.println(" ");
		
		Staff sf1 = new Staff ("199906222015045002", "Andita Sari", "Badung", false, "Humas Dekanat Staff");
		
		sf1.printAllInfo();
	}

}

//assignment make new class lecturer and 