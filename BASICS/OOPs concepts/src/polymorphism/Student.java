package polymorphism;

class Student{

// Here we using same method name but the parameter value is diffrent
	
void studentDetails(int id)
{
System.out.println("My Id Number is" + id);
}
void studentDetails(String name)
{
System.out.println("My name is "+ name);
}

void studentDetails(float per){
System.out.println("My Test percentage is " + per);
}

public static void main(String[]arg)
{
Student s=new Student();
s.studentDetails("sundararajan"); 
}
}

