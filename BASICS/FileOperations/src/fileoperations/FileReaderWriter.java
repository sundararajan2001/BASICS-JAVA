package fileoperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
	public static void main(String[] args) {
		File file1 = new File("C:\\Users\\SUNDARARAJAN\\Desktop\\NewFile.txt");
		boolean  Already = file1.exists();
		if(Already == false)
		{
			try {
				file1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			try (FileWriter writer = new FileWriter(file1)) {
				writer.write(65);
				writer.write("\nSundar");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			try (FileReader reader = new FileReader(file1)) {
				try {
					int op = reader.read();
					while(op !=-1)
					{
						System.out.print((char)op);
							op = reader.read();
					}
				}
					catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				throw e;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		
	}

}
