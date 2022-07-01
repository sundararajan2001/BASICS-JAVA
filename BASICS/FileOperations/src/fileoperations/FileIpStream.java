package fileoperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIpStream {

	public static void main(String[] args) {
		try {
			try (FileInputStream file1 = new FileInputStream("C:\\Users\\SUNDARARAJAN\\Desktop\\NewFile.txt")) {
				try {
					int ip = file1.read();
					while(ip!=-1)
					{
						System.out.print((char)ip);
						ip = file1.read();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				throw e;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
