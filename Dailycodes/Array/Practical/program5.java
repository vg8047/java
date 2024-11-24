import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array: ");

		int size = sc.nextInt();

		int arr[] = new int[size];

	for(int i=0;i<arr.length;i++){

		arr[i] = sc.nextInt();

	}

	System.out.println("Array elements before operation : ");

	for(int i=0;i<arr.length;i++){

		System.out.print(arr[i]+" ");

	}

	System.out.println();

	 for(int i=0;i<arr.length;i++){

		 if(arr[i]<0){

			 arr[i]*=arr[i];

		 }

	 }

	 System.out.println("Array elements after operation : ");

	  for(int i=0;i<arr.length;i++){

 
          	 System.out.print(arr[i]+" ");

	}
    }
}
