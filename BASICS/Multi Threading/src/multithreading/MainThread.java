package multithreading;

public class MainThread {

	public static void main(String[]args) {
		ChildThread obj = new ChildThread();
	
	obj.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main");
		}
		
	}
}
