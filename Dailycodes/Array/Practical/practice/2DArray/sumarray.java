import java.util.*;
class Demo{

	public static void main(String[] args){

		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the no of rows = ");

	        int rowcount = sc.nextInt();

		System.out.println("Enter the no of columns = ");

		int column = sc.nextInt();

		int arr[][] = new int[rowcount][column];

		for(int i=0;i<rowcount;i++){ 

			System.out.println("enter the numbers for row : "+(i+1));

		        for(int j=0;j<column;j++){

				arr[i][j] = sc.nextInt();
			}
		}
		
		int sum = 0;

		for(int i=0;i<rowcount;i++){


			for(int j=0;j<column;j++){
                            
				sum = sum+arr[i][j];

			}

		   }

			System.out.println("the sum of the array "+sum);

	}
}
