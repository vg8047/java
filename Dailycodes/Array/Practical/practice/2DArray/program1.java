import java.util.*;

class Demo{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows = ");

		int row = sc.nextInt();

		System.out.print("Enter the no of columns= ");

		int column = sc.nextInt();

		int arr[][] = new int[row][column];

		for(int i=0;i<row;i++){

			for(int j= 0;j<column;j++){

				arr[i][j] = sc.nextInt();

			}
		}

		for(int i=0;i<row;i++){

			for(int j=0;j<column;j++){

				System.out.print(arr[i][j]+"\t");

			}

			System.out.println();
		}
	}
}
