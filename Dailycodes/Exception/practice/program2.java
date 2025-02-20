import java.io.*;

class CheckException{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
		int x = 0;
		
		try{
		      x = Integer.parseInt(br.readLine());
		
		}catch(IOException io){

			  System.out.println("in catch");

		}catch(NumberFormatException ne){

			   System.out.println("please enter only integer");
			   x = Integer.parseInt(br.readLine());

		}

		System.out.println(x);

	}
}
