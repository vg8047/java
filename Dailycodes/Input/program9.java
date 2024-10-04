import java.io.*;

class Demo{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the college name=");

		String collegename=br.readLine();

		System.out.print("Enter the academic year=");

		String year =br.readLine();

		System.out.print("Enter the cgpa=");
		Float cgpa = Float.parseFloat(br.readLine());

		System.out.print("Enter the name of student= ");
		String name=br.readLine();


		System.out.println("college name="+collegename);
		System.out.println("academic year="+year);
		System.out.println("cgpa="+cgpa);
		System.out.println("name of student="+name);


	


	}
}
