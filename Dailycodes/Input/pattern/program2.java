import java.io.*;

class Demo{

	public static void main(String[] args)throws Exception{

		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter the rows = ");

		int row = Integer.parseInt(br.readLine());

		for(int i=1;i<=row;i++){

			for(int j=1;j<=i;j++){

				System.out.print(row*row+" ");

			}
			 System.out.println();

		}
	}
}
