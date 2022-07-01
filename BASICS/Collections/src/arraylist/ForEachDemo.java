package arraylist;
import java.util.*;


class ForEachDemo
{
public static void main(String[] arg)
{	
	
	
	
		ArrayList<Integer> al = new ArrayList<>();
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
	
		System.out.println(al);
		
		
		System.out.println("USING FOR EACH LOOP");

		System.out.println("For Each Loops Iteration Starts");
		for(int i: al)
		{
		System.out.println(i);
		}
		System.out.println("USING ITERATOR ");
		Iterator<Integer> i =al.iterator();
		System.out.println("Iterator Loop Starts");
			while(i.hasNext())
			{
			System.out.println(i.next());

		}

		System.out.println("After Removal" +al);
		
		System.out.println("USING LIST ITERATOR");
		
		ListIterator<Integer> li= al.listIterator();
		li.add(99);
		li.add(77);
		li.add(88);
		System.out.println("after added value" + al);
		while(li.hasNext())
		{
			
			if(li.next().equals(12))
			{
				li.set(100);
			}
		}
		
		System.out.println("After Set value 100 " +al);
	}
	}


