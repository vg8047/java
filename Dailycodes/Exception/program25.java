import java.io.*;

class ExtraCatch{

	public static void main(String[] args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try{
			int age = Integer.parseInt(br.readLine());
			Thread.sleep(3000);

		}catch(IOException ioe){

			 System.out.println("Connection break");

		}catch(NumberFormatException nfe){

			System.out.println(nfe);

		}catch(InterruptedException ie){

			 System.out.println("zopu de");
		}

		System.out.println("End main");

	}
}
