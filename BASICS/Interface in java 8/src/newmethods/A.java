package newmethods;

import java.util.Scanner;

public interface A {
	Scanner sc = new Scanner (System.in);
	default void name()
	{
	System.out.println(sc.nextLine());
	}
	default void regno()
	{
	int reg=sc.nextInt();;
	System.out.println("reg no "+ reg);	
	}
	
	void collageName();
	
	static void dept() 
	{
		System.out.println("ECE DEPARTMENT");
	}

}
