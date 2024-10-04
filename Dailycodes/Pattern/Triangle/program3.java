import java.util.*;

class Demo{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the rows=");

		int row = sc.nextInt();
             
		for(int i=1;i<=row;i++){

		      int rowcount=row;	
			for(int j=1;j<=i;j++){

				
				System.out.print(rowcount+" ");
				rowcount--;

				}

			

			System.out.println();

		}
	}
}
						 

