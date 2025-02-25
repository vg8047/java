import java.io.*;

class Employee implements Serializable{

	int empid;
	String empName;

	Employee(int empid,String empname){

		this.empid = empid;
		this.empName = empname;

	}

}

class SerialDemo{

	public static void main(String[] args)throws IOException{

		FileOutputStream  fos = new FileOutputStream("Employee.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Employee  obj1 = new Employee(1,"om");

		Employee obj2 = new Employee(2,"vikas");

		oos.writeObject(obj1);
		oos.writeObject(obj2);

		oos.close();
		oos.close();

	}
}
