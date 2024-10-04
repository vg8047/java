import java.util.*;

class Pattern7{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of  rows=");

		int rows = sc.nextInt();

		
                for(int i=1; i<=rows;i++){

		          int character=97;
                          
			  character=character+rows-1;

                  
			for(int j=1;j<=rows;j++){

				

				System.out.print((char)character+ " ");

				character--;

			}

			System.out.println();
		}
	}
}


