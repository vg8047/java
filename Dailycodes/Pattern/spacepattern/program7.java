import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows=");

		int rowcount = sc.nextInt();

		for(int i=0;i<rowcount;i++){

			for(int space=1;space<=i;space++){

				System.out.print(" "+" ");

			}

			for(int j=1;j<=rowcount-i;j++){

				System.out.print(rowcount-i+" ");

			}
			System.out.println();
		}
	}
}
