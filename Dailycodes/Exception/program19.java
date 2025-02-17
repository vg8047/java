import java.io.*;

class Demo{

	static void fun()throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

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
