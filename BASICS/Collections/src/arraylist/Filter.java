package arraylist;
import java.util.*;
import java.util.stream.Collectors;

public class Filter{

public static void main(String[] arg)
{
List<String> ver=new ArrayList<String>();

ver.add("Sundar");
ver.add("Arun");
ver.add("Shreedhar");
ver.add("Bala");
ver.add("Tamil");
System.out.println(ver);
ver.stream().filter(s-> s.startsWith("S")).forEach(System.out::println);
List <String> sort = ver.stream().sorted().collect(Collectors.toList());
System.out.println("Afet sorting List: " +sort);
System.out.println(ver);
}
}