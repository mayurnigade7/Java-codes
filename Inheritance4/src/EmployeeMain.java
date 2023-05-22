
public class EmployeeMain {

	public static void main(String[] args) {
		
		Manager mobj=new Manager(101, "Mayuresh", 250000, 5000);
		Developer dobj=new Developer(202, "Vaishu", 10000, 12);
		
		/*System.out.println("---------------Manager data----------");
		System.out.println("Manager Id: "+mobj.getEmpId());
		System.out.println("Manager Name: "+mobj.getEmpName());
		System.out.println("Manager salary: "+mobj.getEmpSalary());
		System.out.println("Manager Bonus: "+mobj.getBonus());
		
		System.out.println("---------------Devloper data----------");
		System.out.println("Developer Id: "+dobj.getEmpId());
		System.out.println("Developer Name: "+dobj.getEmpName());
		System.out.println("Developer salary: "+dobj.getEmpSalary());
		System.out.println("Developer Bonus: "+dobj.getBonus());*/
	}
	public static void display(Employee eobj)
	{
		System.out.println(eobj);
	}

}
