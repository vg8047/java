import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = 0;
		int y = 0;

		System.out.println("Enter values for x and y");

		try{
			x = Integer.parseInt(br.readLine());
			y = Integer.parseInt(br.readLine());

			System.out.println(x/y);

		}catch(IOException ioe){

			System.out.println("connection break");
		
		}catch(NumberFormatException ne){

			System.out.println("Wrong inpur");

		}catch(ArithmeticException ae){
                         
			System.out.println("enter the y value again");

			y = Integer.parseInt(br.readLine());

			System.out.println(x/y);

		 }finally{

			 System.out.println("clean up the code");

		 }

	}
}
			 
