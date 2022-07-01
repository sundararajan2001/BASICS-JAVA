package set;
import java.util.*;

class LinkedHashSetDemo{
	public static void  main(String[]arg)
	{
		LinkedHashSet<Integer> li= new LinkedHashSet <Integer>();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("how much size your list has?:");
			int n= sc.nextInt();
			System.out.println("Enter the values");
			for(int i=0;i<n;i++)
			{
				int j= sc.nextInt();
				li.add(j);
			}
		}
		li.remove(2);
		System.out.println(li);
		System.out.println("Using Iterator");
		Iterator<Integer> s = li.iterator();
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
		
		System.out.println("size of the set :" +li.size());
		System.out.println(li.contains(5));
		li.removeAll(li);
		System.out.println("After remove all values set is empty :" +li.isEmpty());
		
	}
}