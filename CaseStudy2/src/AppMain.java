import java.time.LocalDate;
import java.util.Scanner;

public class AppMain {


	public static void main(String[] args) {
		int ch=0;
		Scanner sc=new Scanner(System.in);
		final LocalDate enrollmentDate = null;
		AppEngine app=new AppEngine();
		System.out.println("hh");
		
		/*Enroll enr =new Enroll(student, course, LocalDate);
		do {
		System.out.println("Enter your choice:");
		ch=sc.nextInt();
		switch(ch) 
		{
		case 1:
			System.out.println("Course Details");
			app.introduce(null);
			break;
			
		case 2:
			System.out.println("Resgister Student details");
			app.register(null);
			break;
		
		case 3:
			System.out.println("List of students");
			app.listOfStudents();
			break;
		case 4:
			System.out.println("List of course");
			app.listOfCourses();
			break;
		case 5:
			
		app.display(enr);
		 break;
		}
		System.out.println("Do you want to conti press 1:");
		ch=sc.nextInt();
		}	
		while(ch==1);
		{
			System.out.println("Thank you");
		}*/
		
		Student student=new Student(25,"Student");
		Course course=new Course(201,"Course");
		
		Enroll enr=new Enroll(student, course, enrollmentDate);
		app.introduce(null);
		app.register(null);
		app.listOfCourses();
		app.listOfStudents();
		app.display(enr);

}

}
