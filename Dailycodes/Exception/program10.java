import java.io.*;
class Demo{

	 void fun()throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter integer value : x");

		int x = Integer.parseInt(br.readLine());

		System.out.println("Enter integer value : y ");

		int y = Integer.parseInt(br.readLine());

		System.out.println(x/y);

           }

	 public static void main(String[] args)throws IOException{

		 Demo obj = new Demo();

		 obj.fun();


	 }
}
