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

		for(int i=0;i<arr.length;i++){

			for(int j=0;j<arr[i].length;j++){

				if(arr[i][j]%3==0){

			           System.out.println(arr[i][j]+" ");

		      }

		}
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
