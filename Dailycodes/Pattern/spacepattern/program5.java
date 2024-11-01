import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows=");

		int rowcount = sc.nextInt();

		for(int i=1;i<=rowcount;i++){

			for(int space=1;space<=rowcount-i;space++){

				System.out.print(" "+ " ");

			}

			for(int j=1;j<=i;j++){

				System.out.print(i*j+" ");

			}
			System.out.println();
		}
	}
}
