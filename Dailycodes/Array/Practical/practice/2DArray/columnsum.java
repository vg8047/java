import java.util.*;

class Demo{

	static void Oddrowsum(int row,int column){

		int arr[][] = new int[row][column];

		Scanner sc= new Scanner(System.in);

		for(int i=0;i<row;i++){

			System.out.print("enter the elements of row"+(i+1)+"=");

			for(int j=0;j<column;j++){

				arr[i][j] = sc.nextInt();

			}

		}

		for(int i=0;i<row;i++){

			int sum = 0;

			for(int j=0;j<row;j++){

				for(int k=0;k<column;k++){

				  if(k==i){

					sum = sum +arr[j][k];

				}
			}
		  }

			  System.out.println("the sum of column=  "+(i+1)+"= "+sum);

		   }
		}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows = ");

		int rowcount = sc.nextInt();

		System.out.print("Enter the no of columns = ");

		int columns = sc.nextInt();

		 Oddrowsum(rowcount,columns);

	}
}	
