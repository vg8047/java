import java.io.*;

class Demo{

	public static void main(String[] args) throws IOException{

	           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		   

		int num = Integer.parseInt(br.readLine());

		if(num >1 && num <1000){

			System.out.println(num +" is in the range of 1 to 1000");

		}else{
			System.out.println(num+" is not in the range of 1 to 1000");
			
		}
		
	}
}
