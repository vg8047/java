import java.io.*;

class Demo{

	 public static void main(String[] args)throws IOException{

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 System.out.print("Enter the name=");

		 String name = br.readLine();

		 System.out.print("Enter the society name=");

		 String society = br.readLine();

		 System.out.print("Enter the wing name=");

		 char wing = (char)br.read();

		 br.skip(1);

		 System.out.print("Enter the flat no=");

		 int flatno = Integer.parseInt(br.readLine());

	 }
}
