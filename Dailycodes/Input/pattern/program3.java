import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter the row no=");

		int row = Integer.parseInt(br.readLine());

		for(int i=1;i<=row;i++){

			char ch ='a';

			for(int j=1;j<=i;j++){

				if(i%2==0){

					System.out.print("$"+" ");

				}else{
					System.out.print(ch+" ");
					ch++;

				}

			}
			System.out.println();
		}
	}
}
