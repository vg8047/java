import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array = ");

		int size = sc.nextInt();

		int arr[] = new int[size];

	for(int i=0;i<arr.length;i++){

		arr[i] = sc.nextInt();

	}

	System.out.println();

	System.out.println("Array elements are = ");

	 for(int i=0;i<arr.length;i++){

		 System.out.print(arr[i]+" ");

	 }

	 System.out.println();

	 System.out.println("Array elements after the reverse order : ");
	   
	    for(int i=size-1;i>=0;i--){

		    System.out.print(arr[i]+" ");

	    }

	}
}
