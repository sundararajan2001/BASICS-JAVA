package abstraction;

public abstract class Teacher{
public static void main(String[]arg)
{
Student a= new Student();
a.degree();
a.college();
a.branch();

}
abstract void branch();
void degree()
{
int cutoff=198;
System.out.println("your cutoff is "+ cutoff + " so Choose Engineering degree");
}

void college()
{
System.out.println("Top collages like IIT's , NIT's or ANNA UNIV");
}

}


class Student extends Teacher
{

void branch()
{
System.out.println("Ok sir.I want to take ECE Dept");
}

} 
