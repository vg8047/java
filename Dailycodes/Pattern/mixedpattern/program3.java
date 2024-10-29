import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows=");

		int rowcount = sc.nextInt();


		for(int i=1;i<=rowcount;i++){

			int character = 64 + rowcount;


			for(int j=1;j<=rowcount;j++){

				if(i%2==1){

				    System.out.print((char)character +" ");

				}else{
					System.out.print(j +" ");

				}

				character--;
			}
			System.out.println();
		}
	}
}
