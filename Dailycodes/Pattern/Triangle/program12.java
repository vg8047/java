import java.io.*;

class Demo{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the no of rows= ");

		int row = Integer.parseInt(br.readLine());

		int letter = 97;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=i;j++){

				if(j%2==0){

					System.out.print((char)(letter)+" ");
					letter++;

				}else{
					System.out.print(i+" ");
				}

			}
			System.out.println();
		}
	}
}
