import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{
		

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your name=");

		String name = br.readLine();

		System.out.print("Enter your society name=");

		String society = br.readLine();

		System.out.print("Enter the wing=");

		String wing = br.readLine();

		System.out.print("Enter the flat no =");

		String flatno = br.readLine();

	}
}
