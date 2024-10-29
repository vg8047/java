import java.util.*;

class Inverttriangle{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of rows=");

		int rowcount = sc.nextInt();

		int count=0;

		for(int i=1;i<=rowcount;i++){

			for(int j=1;j<=rowcount-i+1;j++){

				count+=2;

				System.out.print(count+" ");

			}
			System.out.println();

		}
	}
}


