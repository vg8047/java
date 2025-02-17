import java.io.*;

class Demo{

	static void fun()throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               
		try{
			br.close();
		
		}catch(IOException io){
		
		}

		String str = null;

		try{
		
		      str= br.readLine();
		
		}catch(IOException ioe){

		            ioe.printStackTrace();

		}

		System.out.println(str);

	}

	public static void main(String[] args){
              
	       try{
		    fun();
	       }catch(IOException i){

		       System.out.println("kay karu");

	       }

	}
}
