import java.util.*;

class Pattern{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the row no=");

		int row = sc.nextInt();

	          

		for(int i=1;i<=row;i++){

		  int count=i;

			for(int j=1;j<=i;j++){

				

				System.out.print(count+" ");

				count++;

				}
			

			
			
		
			System.out.println();

		}
	}
}
