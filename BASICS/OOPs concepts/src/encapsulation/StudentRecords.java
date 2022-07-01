package encapsulation;

class Student {
int regno;
String name;
public int getRegno() {
	return regno;
}
public void setRegno(int regno) {
	this.regno = regno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}

public class StudentRecords {

	public static void main(String[] args) {
		Student s= new Student();
		s.setRegno(1814095);
		s.setName("Sundararajan");

		System.out.println("My Register num is :"  +s.getRegno());
		System.out.println("My name is :" +s.getName());
		
	}


}

