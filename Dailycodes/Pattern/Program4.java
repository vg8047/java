import java.util.*;

class Pattern4{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of  rows=");

		int rows = sc.nextInt();

		int character=65;


		
		for(int i=1; i<=rows;i++){

			
			for(int j=1;j<=rows;j++){

				
				System.out.print((char)character+ " ");

				character=character+2;

			}

			System.out.println();
		}
	}
}


