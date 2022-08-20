package question2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		employee emp=new employee();
		emp.setName("maheshwarsahni");
		emp.setBirth("13/14/2021");
		emp.setDepartment("cashdepartment");
		emp.setDesignation("manager");
		emp.setSalary(348238);
		
		File file=new File("OutObject.txt");
		
		FileOutputStream fo=new FileOutputStream(file);
		ObjectOutputStream ooos=new ObjectOutputStream(fo);
		ooos.writeObject(emp);	
		ooos.close();
		
		
		
		
		FileInputStream fi=new FileInputStream(file);
		ObjectInputStream oi=new ObjectInputStream(fi);
		
		Object obj=oi.readObject();
		
		employee emp1=(employee)obj;
		System.out.println(emp1.getName());
		System.out.println(emp1.getBirth());
		System.out.println(emp1.getDepartment());
		System.out.println(emp1.getDesignation());
		System.out.println(emp1.getSalary());
		
	}

}
