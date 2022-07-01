package fileoperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWR {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\SUNDARARAJAN\\Desktop\\NewFile1.txt");
		FileWriter fWriter = null;
		try {
			fWriter = new FileWriter(file);
		} catch (IOException e) {
			System.out.println("exception occurs..");
			e.printStackTrace();
		}
		BufferedWriter writer = new BufferedWriter(fWriter);
		try {
			writer.write("Hi how are you??..");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			System.out.println("exception...!!");
			e.printStackTrace();
		}
		
		
		try (FileReader fReader = new FileReader(file)) {
			BufferedReader read = new BufferedReader(fReader); 
			int op = read.read();
			while(op!=-1)
			{
				System.out.print((char)op);
				op = read.read();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
