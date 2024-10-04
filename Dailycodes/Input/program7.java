import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

             InputStreamReader isr = new InputStreamReader(System.in);

	     BufferedReader br = new BufferedReader(isr);


	     System.out.print("Enter the company name=");
               
	     String compname = br.readLine();

	     System.out.print("Enter the employee id=");

	     int empid = Integer.parseInt(br.readLine());

	     System.out.print("Enter the employee name= ");

	     String name= br.readLine();

	     System.out.println(compname);
	     System.out.println(empid);
	     System.out.println(name);

	}
}

