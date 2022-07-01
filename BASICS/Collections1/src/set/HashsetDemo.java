package set;

import java.util.*;

public class HashsetDemo {

	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<Integer>();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("how much size your list has?:");
			int n= sc.nextInt();
			System.out.println("Enter the values");
			for(int i=0;i<n;i++)
			{
				int j= sc.nextInt();
				s.add(j);
			}
		}
		
		System.out.println(s);
		s.remove(11);
		System.out.println(s.size());
		Iterator<Integer> n = s.iterator();
		while(n.hasNext())
		{
			System.out.println(n.next());
		}
		System.out.println(s);
		s.clear();
		System.out.println(s.isEmpty());
		
		
	}

}
