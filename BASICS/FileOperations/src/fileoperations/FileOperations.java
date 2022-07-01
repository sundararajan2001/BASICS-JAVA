package fileoperations;
import java.io.*;
import java.util.Scanner;

public class FileOperations {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter a number");
			File newFile = new File("C:\\Users\\SUNDARARAJAN\\Desktop");
			File newFile1 = new File("C:\\Users\\SUNDARARAJAN\\Desktop\\Sundar.txt");
			while (true)
			{
			switch(sc.nextInt())
			{
				case 1: 
					File newFile2 = new File("C:\\Users\\SUNDARARAJAN\\Desktop\\sundararajan");
						System.out.println("Creating new Folder");
						newFile2.mkdir();
						break;
				case 2:
						System.out.println("creating .txt File");
						boolean present = newFile1.exists();
						if (present ==false)
						{
							try {
								newFile1.createNewFile();
							} catch (IOException e) {
								System.out.println("exception occurs..!!");
								e.printStackTrace();
							}
						}
						break;
					
				case 3:
					System.out.println(newFile1.getName());
					break;
				case 4:
					File rename = new File("C:\\Users\\SUNDARARAJAN\\Desktop\\SundarV.txt");
					boolean reName = newFile1.renameTo(rename);
					System.out.println(reName);
					break;
				case 5:
					System.out.println("Deleting file...");
					newFile.delete();
					break;
					
				case 6:
					System.out.println("Listing Files &Folders....");
					String [] listOfFiles = newFile.list();
					for(String s : listOfFiles )
					{
						System.out.println(s);
					}
					break;
				case 7:
					System.out.println("Listing only folders....");
					File [] ff = newFile.listFiles();
					for(File f: ff)
					{
						if (f.isDirectory())
						System.out.println(f);
					}
					break;
			}
			}
		}

	}



	

}
