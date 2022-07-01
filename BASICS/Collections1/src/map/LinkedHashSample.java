package map;
import java.util.*;
import java.util.Map.Entry;
public class LinkedHashSample {

	public static void main(String[] args) {
				LinkedHashMap <Integer,String> data1 = new LinkedHashMap<Integer, String>();
				data1.put(1,"Sundar");
				data1.put(2,"Shreedhar");
				data1.put(3,"Arun");
				data1.put(4,"Bala");
				System.out.println(data1.values());
				System.out.println(data1.containsValue("Shree"));
				data1.remove(3);
				System.out.println(data1.containsKey(3));
				data1.replace(4, "Bala", "Balanandhakumar");
				System.out.println("After replace the value:" + data1);
				System.out.println(data1.get(4));
				Iterator<Entry<Integer, String>> ss = data1.entrySet().iterator();
				{
					while(ss.hasNext())
					{
						System.out.println(ss.next());
					}
				}
				data1.clear();
				System.out.println(data1);
				
				
			}

	}


