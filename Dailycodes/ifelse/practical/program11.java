import java.io.*;

class Demo{

	public static void main(String[] args) throws IOException{

	           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		   

		int num = Integer.parseInt(br.readLine());

		if(num%13==0){

			System.out.println(num +" is in the table of 13");

		}else{
			System.out.println(num+" is not in the table of 13");
			
		}
		
	}
}
