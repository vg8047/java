import java.util.*;

class Pattern{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the row no=");

		int row = sc.nextInt();

		for(int i=0;i<row;i++){

			for(int j=row;j>i;j--){

				System.out.print(row-i+" ");
			}
			
		
			System.out.println();

		}
	}
}
