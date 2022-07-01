package map;
import java.util.*;
import java.util.Map.Entry;
public class HashMapSample {

	public static void main(String[] args) {
		TreeMap <Integer,String> data = new TreeMap<Integer, String>();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("operations");
			System.out.println("Enter 1 - Add a value");
			System.out.println("Enter 2 - Remove a value");
			System.out.println("Enter 3 - Remove all values");
			System.out.println("Enter 4 - Check list is empty ");
			System.out.println("Enter 5 - Iterator");
			System.out.println("Enter 6 - replace the value");
			while(true)  
			    {  	
					switch (sc.nextInt()) {
			        case 1:
			        	System.out.println("Add key - value pair");
			        	data.put(sc.nextInt(), sc.nextLine());
			            break;
			        case 2:
			        	System.out.println("remove value");
			        	data.remove(sc.nextInt());
			        case 3:
			        	System.out.println("Clearing all values...");
			        	data.clear();
			        	break;
			        case 4:
			        	System.out.println("Checking list is empty?");
			        	System.out.println(data.isEmpty());
			        	break;
			        	
			        case 5:
			        	System.out.println("Iterating...");
			        	Iterator<Entry<Integer, String>> n= data.entrySet().iterator();
			        	while(n.hasNext())
			        	{
			        		System.out.println(n.next());
			        	}
			        	break;
			        case 6:
			        	System.out.println("Replace the value");
			        	System.out.println(data.replace(sc.nextInt(), sc.nextLine()));
			        	break;
			        default:
			        	System.out.println("Enter values 1-6 only");
			        	break;
			        }
			        System.out.println("Result" +data); 
			    }
			
}
		catch (Exception e)
		{
			System.out.println("use only integer");
		}	
	}

}
