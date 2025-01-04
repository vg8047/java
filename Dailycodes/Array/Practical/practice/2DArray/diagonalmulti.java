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

		int product = 1;

		for(int i=0;i<arr.length;i++){

			for(int j=0;j<arr[i].length;j++){

				if(i==j){

			           product = product*arr[i][j];
				}

			}
		}

	       System.out.println("the product of diagonals are= "+product);	
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
