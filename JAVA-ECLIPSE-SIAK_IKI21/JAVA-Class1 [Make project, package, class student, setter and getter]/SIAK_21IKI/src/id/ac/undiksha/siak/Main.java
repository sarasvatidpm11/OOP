package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Student;

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
	}

}

//assignment make new class lecturer and 