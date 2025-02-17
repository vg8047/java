import java.io.*;

class Demo{

	public static void main(String[] args){
      
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			int x = Integer.parseInt(br.readLine());
			int y = Integer.parseInt(br.readLine());

			Thread.sleep(5000);
            
                        System.out.println(x/y);

		}catch(IOException ioe){
			 
			System.out.println("IOException block");

		}catch(InterruptedException ie){

			System.out.println("interrupt exception");        //it creates an exception table in bytecode

		}catch(NumberFormatException ne){

			System.out.println("nuber exception");

		}catch(ArithmeticException ae){

			System.out.println("divide by zero");

		}finally{

			System.out.println("in finally block");

		}

	}
}
		


			
