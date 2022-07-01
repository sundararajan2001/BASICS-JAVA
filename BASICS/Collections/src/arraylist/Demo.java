package arraylist;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(10);
		al.add("Sundararajan v");
		al.add(11);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		ArrayList<Object> al1 = new ArrayList<Object>();
		al1.addAll(al);
		System.out.println(al1);
		
	}

}
