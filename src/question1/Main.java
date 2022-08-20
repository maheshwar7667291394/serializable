package question1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Address address=new Address("bihar","patna","78542");
		Student student=new Student(12,"babumahesh", address);
		
		
		
		File file=new File("student.txt");
		
		FileOutputStream fo=new FileOutputStream(file);
		ObjectOutputStream os=new ObjectOutputStream(fo);
		os.writeObject(student);
		os.close();
		
		FileInputStream fi=new FileInputStream(file);
		ObjectInputStream oi=new ObjectInputStream(fi);
		Object ost=oi.readObject();
	
		Student os1=(Student)ost;
		 System.out.println(os1.getName());
		 System.out.println(os1.getRoll());
		 System.out.println(os1.getAddress().getCity());
		 System.out.println(os1.getAddress().getState());
		
		
		
		
		}

}
