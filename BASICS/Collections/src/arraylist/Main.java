package arraylist;
import java.util.*;

public class Main implements Calculator {
	
	public static void main(String[] arg)
	{
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("enter number:");
		int a= sc.nextInt();
		System.out.println("Enter another number");
		int b=sc.nextInt();


		Main obj=new Main();
		obj.add(a,b);
		obj.sub(a,b);
	}
	catch(Exception e)
	{
		System.out.println("enter Integers only");
	}
	}

	


	@Override
	public void add(int a,int b) {
		// TODO Auto-generated method stub
		a=a+b;
		System.out.println(a);
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		a=a-b;
		System.out.println(a);
	}


}
