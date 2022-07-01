package inheritance;

interface Employee1 {
	void work();
	void taskcomplete();
	}

interface Employee2{
         
	void work();
	void taskcomplete();
}

class Company implements Employee1,Employee2
{
	public static void main(String [] args)
	{
		
	Company a= new Company();
	a.work();
        a.taskcomplete();

	}

	@Override
	public void work() {
		System.out.println("Don't Take leave Unecessaryly");
	}

	@Override
	public void taskcomplete() {
		 System.out.println("Must complete Daily task");
		
	}


	
}