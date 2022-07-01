package newmethods;

public class Main implements A {

	public static void main(String [] arg)
	{
	Main obj=new Main();
	obj.collageName();
	obj.name();
	obj.regno();
	A.dept();
	}


	@Override
	public void collageName() {
		System.out.println("S.A ENGINEERING COLLEGE");
		
	}
}
