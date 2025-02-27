import java.io.*;

class Employee implements Serializable{

	 int empId;

	 String empName;

	 Employee(int empId,String empName){

		 this.empId = empId;
		 this.empName = empName;

	 }

}

class SerialDemo{

	 public static void main(String[] args)throws Exception{

		  FileOutputStream fos = new FileOutputStream("Employee.txt");

		  ObjectOutputStream oos = new ObjectOutputStream(fos);

		  Employee obj1 = new Employee(1,"om");

		  Employee obj2 = new Employee(2,"vikas");


		  oos.writeObject(obj1);
		  oos.writeObject(obj2);

		  oos.close();

		  fos.close();

	 }
}

class DeserialDemo{

	public static void main(String[] args)throws Exception{

		 FileInputStream fis = new FileInputStream("Employee.txt");

		 ObjectInputStream ois = new ObjectInputStream(fis);

		 Employee fileobj1 = (Employee)ois.readObject();

		 Employee fileobj2 =(Employee) ois.readObject();

		 System.out.println(fileobj1.empId);

		 System.out.println(fileobj1.empName);
            
		 System.out.println(fileobj2.empId);

              	 System.out.println(fileobj2.empName);

	}
}



