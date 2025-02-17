import java.io.*;

class Demo{

	public static void main(String[] args){

	          System.out.println("Start main");

		  BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));


		  try{
			  int age = Integer.parseInt(br.readLine());
			  

		  }/*catch(IOException ioe){

		  } */catch(Throwable nfe){

			    System.out.println(nfe);

		  }

		  System.out.println("End main");
        }
}
