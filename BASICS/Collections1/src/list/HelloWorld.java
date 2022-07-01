package list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HelloWorld
{

 public static void main(String []args){
	
    	 try (Scanner sc = new Scanner(System.in)) {
			int j;
			System.out.println("how many time you add values in list");
			int n=sc.nextInt();
			 System.out.println("Enter values");
			ArrayList<Integer> l=new ArrayList<Integer>();
			 for(int i=0;i<n;i++)
			 {  
				 j=sc.nextInt();
			     l.add(j);
			 }
			System.out.println(l);
			l.add(2, 12);
			l.remove(2);
			l.set(2, 12);
			System.out.println(l);
			Iterator<Integer> i =l.iterator();
			while(i.hasNext())
			{
			  System.out.println(i.next());
			}
			System.out.println("12 is present in list? :" +l.contains(12));
			System.out.println(l.get(2));
			System.out.println("Index of 15 is :" +l.indexOf(15));
			l.clear();
			System.out.println("After cleared, List is " + l);
			System.out.println(l.isEmpty());
		}
		
	}
 }