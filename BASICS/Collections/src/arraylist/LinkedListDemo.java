package arraylist;


import java.util.*;

public class LinkedListDemo {

	public static void main(String[]arg)
	{
		LinkedList<Object> al = new LinkedList<Object>();
		al.add(10);
		al.add("Sundar");
		al.addFirst(10);
		al.add(10);
		al.addLast(133);
		al.add(12);
		al.add(11);
		System.out.println(al);
		al.remove(2);
		al.remove(3);
		al.remove("Sundar");
		System.out.println(al);
		al.set(2, 76);
		System.out.println(al);
		
		Set<Integer> s = new HashSet<>();
		System.out.println("enter values ");
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
        s.add(a);
        s.add(6);
        s.add(3);
        s.add(5);
        s.add(4);
        System.out.println(s);
		
	}
}
