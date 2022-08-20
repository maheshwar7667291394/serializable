package question4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws IOException {
		Address address=new Address("bihar","patna","75478");
	Employee emp=new Employee(1,"rambilash",address,"maku@gami9l","mafd123");
	
	File file=new File("emp.txt");
	
	FileOutputStream fooutput=new FileOutputStream(file);
	ObjectOutputStream objout=new ObjectOutputStream(fooutput);
	objout.writeObject(emp);
	objout.close();
	
	FileInputStream fis=new FileInputStream(file);
	ObjectInputStream ois=new ObjectInputStream(fis);
	
	try {
		Object obj=ois.readObject();
		Employee emp1=(Employee)obj;
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getEmail());
		System.out.println(emp1.getPassword());
		System.out.println(emp1.getAddress());
		
		
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	
	
		
	}

}
