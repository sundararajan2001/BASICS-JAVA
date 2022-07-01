package newmethods;

import java.util.Scanner;

public class Employee1 implements Details {
	
	public static void main(String[]arg)
	{
	 Employee1 obj = new Employee1();
	 obj.empName();
	 obj.empId();
	 obj.getLeaves();
	
	}
	
	public void empName() {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter employee name:");
		 String name = sc.nextLine();
			System.out.println("Employee Name - " +name);
	}
		
	}

	public void getLeaves() {
		int leaves = 10;
	System.out.println("Taking leaves " + leaves +" Days only");
		
	}

	public void empId() {
		int Id = 181;
		System.out.println("Employee Id -" +Id);
		
	}
	

}
