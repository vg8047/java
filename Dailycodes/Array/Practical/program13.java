import java.util.*;

class Demo{

	public static void main(String[] args){

		 Scanner sc = new Scanner(System.in);

		 System.out.print("Enter the size of array: ");

		 int size = sc.nextInt();

		 int arr[] = new int[size];

		 int firstlargest = 0;

		 int secondlargest = 0;

	  for(int i=0;i<arr.length;i++){

		  arr[i] = sc.nextInt();

	  }

	     if(arr[0]>arr[1]){

		      firstlargest = arr[0];

		      secondlargest  = arr[1];

	     }else if(arr[0]<arr[1] && arr[0]!=arr[1]){


		      firstlargest = arr[1];

		      secondlargest =arr[0];

	     }

	     for(int i=2;i<arr.length;i++){

		     if(arr[i]>firstlargest){

			     secondlargest = firstlargest;

			     firstlargest = arr[i];

		     }else if(arr[i]>secondlargest && arr[i]!=firstlargest){

			     secondlargest = arr[i];

		     }

	     }

	     System.out.println("second largest element is = "+secondlargest);
	}
}	
