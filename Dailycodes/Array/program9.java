import java.util.*;

class OnedArray{

	public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array= ");

		int size = sc.nextInt();

	        int arr[] = new int[size];

		for(int i=0;i<arr.length;i++){

			arr[i] = sc.nextInt();

		}

		for(int i=0;i<arr.length;i++){

			System.out.println(arr[i]);

		}

	}
}
