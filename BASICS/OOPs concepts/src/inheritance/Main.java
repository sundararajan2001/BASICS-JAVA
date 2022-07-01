package inheritance;

interface A {
	default void name()
	{
	System.out.println("I am sundararajan");	
	}
	default void regno()
        {
         int a=10;
        System.out.println("Reg no is " + a);
         }
	void collageName();
	
	static void dept() 
	{
		System.out.println("ECE DEPARTMENT");
	}

}

public class Main implements A {

	public static void main(String [] arg)
	{
	Main obj=new Main();
	obj.collageName();
	obj.name();
        obj.regno();
	A.dept();
	}
	public void collageName() {
		System.out.println("S.A ENGINEERING COLLEGE");
		
	}
}
