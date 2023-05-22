import java.util.Scanner;

public class Info {
	public void display(Student  student)
	{
		Student stud=null;
		 stud=new Student(101, "Mayur", 15062001);
		 stud=new Student(102, "Gaurav", 15062001);
		
		System.out.println("Student Name:"+stud.getStd_name());
		System.out.println("Student Id:"+stud.getStd_id());
		System.out.println("Student Dob:"+stud.getStd_Dob());
		
		}
		
	}


