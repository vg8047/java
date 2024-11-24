import java.util.*;

class TwodArray{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows= ");

		int rows = sc.nextInt();

		System.out.print("Enter the no of columns= ");

		int columns = sc.nextInt();

	        int arr[][] = new int[rows][columns];

	for(int i=0;i<arr.length;i++){

		System.out.println("Enter the elements: ");

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

	}

}
