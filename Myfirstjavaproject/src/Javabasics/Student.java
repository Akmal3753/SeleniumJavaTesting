package Javabasics;

public class Student { //class of student is created.

	int id;
	String name;
	void showDetails()
	{
	System.out.println("id="+id);
	System.out.println("name="+name);
	}
	public static void main(String[] args) {
	Student s1= new Student(); // here the object created are 's1 & s2' .
	s1.id=110;
			
	s1.name = "Akmal";	
		s1.showDetails();
		
		
		Student s2= new Student();
		
		s2.id= 115;
		s2.name="Ansari";
		s2.showDetails();
	
	}

}
