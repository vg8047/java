import java.util.*;

class TwodArray{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows= ");

		int row = sc.nextInt();

		System.out.print("Enter the no of columns= ");

		int columns = sc.nextInt();

	        int arr[][] = new int[row][columns];

		System.out.println("Enter the array elements= ");


	for(int i=0;i<arr.length;i++){

		for(int j=0;j<arr[i].length;j++){

			arr[i][j] = sc.nextInt();

		}
	}
                   
	  System.out.println("Array elements are: ");

		  for(int i=0;i<arr.length;i++){

			  for(int j=0;j<arr[i].length;j++){

				  System.out.println(arr[i][j]);

			  }
		  }

		  System.out.println(arr[0][1]);

		  System.out.println(arr[0]);

		  System.out.println(arr);

	}
}
