import java.util.*;

class Pattern6{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of  rows=");

		int rows = sc.nextInt();

		
                for(int i=1; i<=rows;i++){

		         char character='A';

			for(int j=1;j<=rows;j++){

				
				System.out.print(j+""+character+ " ");

				character++;

			}

			System.out.println();
		}
	}
}


