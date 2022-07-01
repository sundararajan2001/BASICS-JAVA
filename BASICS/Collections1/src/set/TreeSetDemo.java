package set;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet <Integer> ti = new TreeSet<Integer>();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("how much size your list has?:");
			int n= sc.nextInt();
			System.out.println("Enter the values");
			for(int i=0;i<n;i++)
			{
				int j= sc.nextInt();
				ti.add(j);
			}
		}
		System.out.println("nearest greater number:" +ti.ceiling(50));
		System.out.println("Closest Lowest number:" +ti.lower(333));
		System.out.println("Iterating ");
		Iterator<Integer> n1= ti.iterator();
		{
			while(n1.hasNext())
			{
				System.out.println(n1.next());
			}
		}
		System.out.println("Iterating Descending Order");
		Iterator<Integer> n= ti.descendingIterator();
		{
			while(n.hasNext())
			{
				System.out.println(n.next());
			}
		}
		System.out.println(ti);
		ti.clear();
		System.out.println("After clear"  + ti);
		

	}

}
