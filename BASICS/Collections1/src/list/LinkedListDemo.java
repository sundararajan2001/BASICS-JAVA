package list;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> l= new LinkedList<Integer>();
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("operations");
				System.out.println("Enter 1 - Add a value");
				System.out.println("Enter 2 - Size of value");
				System.out.println("Enter 3 - Remove all values");
				System.out.println("Enter 4 - Check list is empty ");
				System.out.println("Enter 5 - Remove a value");
				System.out.println("Enter 6 - Iterator");
				System.out.println("Enter 7 - Set the value");
				while(true)  
				    {  	
						System.out.println("enter numbers 1-6");
						switch (sc.nextInt()) {
				        case 1:
				        	System.out.println("Add values");
				        	l.add(sc.nextInt());
				            break;
				        case 2:
				        	System.out.println("Size of List");
				        	System.out.println(l.size());
				        	break;
				        case 3:
				        	l.removeAll(l);
				        	break;
				        	
				        case 4:
				          	System.out.println("is List Empty? :" +l.isEmpty());
				          	break;
				        case 5:
				        	System.out.println("enter the value to remove");
				        	System.out.println(l.remove(sc.nextInt()));
				        	break;
				        case 6:
				        	System.out.println("Iterating...");	
				        	Iterator<Integer> n= l.iterator();
				        	{
				        		while(n.hasNext())
				        		{
				        			System.out.println(n.next());
				        		}
				        	}
				        	break;
				        case 7:
				        	System.out.println("Set a value");
				        	l.set(sc.nextInt(), sc.nextInt());
				        	break;
				   				        default:
				        	System.out.println("Enter values 1-6 only");
				        	break;
				        }
				        System.out.println("Result" +l); 
				    }
				
}
			catch (Exception e)
			{
				System.out.println("use only integer");
			}
			}
	}	  
		
		

