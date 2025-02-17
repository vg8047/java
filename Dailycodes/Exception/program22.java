import java.io.*;

class Demo{

	public static void main(String[] args){

	          System.out.println("Start main");

		  BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));


		  try{
			  int age = Integer.parseInt(br.readLine());
			  

		  }catch(ArithmeticException ae){

			  ae.printStackTrace();

		  }catch(IOException io){

			  io.printStackTrace();
		  
		  }catch(NumberFormatException nfe){

			    nfe.printStackTrace();

		  }

		  System.out.println("End main");
        }
}
