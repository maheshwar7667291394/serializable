package question3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("newfile.txt");
		

		Scanner input=new Scanner(System.in);
		System.out.println("enter the file name");
		String filename=input.nextLine();
		FileReader filereader=new FileReader(filename);
		
		BufferedReader br=new BufferedReader(filereader);
		try {
			String line=br.readLine();
			while(line !=null) {
				System.out.println(line.toUpperCase());
				FileWriter fr=new FileWriter(file);
				fr.write(line.toUpperCase());
				
				line=br.readLine();
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileReader fre=new FileReader(file);
		BufferedReader br1=new BufferedReader(fre);
	
		try {
		String	namk = br1.readLine();
			
			while(namk !=null) {
				System.out.println(namk);
				namk=br1.readLine();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
