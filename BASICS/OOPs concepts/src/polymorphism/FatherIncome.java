package polymorphism;

public class FatherIncome{

public static void main(String[]arg)
{
SonIncome objWork=new SonIncome();
objWork.work();
}

void work() 
{
int salary = 25000;
System.out.println( "Father's Income is " +salary);
}


}

class SonIncome extends FatherIncome
{
void work()  //work method is used in father's class & son's class
{
super.work();
int salary = 50000;
System.out.println("Son's Income is" +salary);
}
}