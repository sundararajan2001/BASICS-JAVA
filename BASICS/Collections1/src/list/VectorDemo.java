package list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args)
	{
		Vector<Integer> list =new Vector<>();
		list.add(10);
		list.add(11);
		list.add(13);
		list.add(14);
		list.add(15);
		System.out.println(list);
		list.add(2, 12);
		list.remove(2);
		list.set(2, 12);
		System.out.println(list.size());
		System.out.println(list);
		Enumeration <Integer> s = list.elements();
		while(s.hasMoreElements())
		{
			System.out.println(s.nextElement());
		}
	}



}