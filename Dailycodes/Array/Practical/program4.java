import java.util.*;
class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array= ");

		int size = sc.nextInt();

	        int arr[] = new int [size];

	for(int i=0;i<arr.length;i++){

		arr[i] = sc.nextInt();

	}

	 for(int i=0;i<arr.length;i++){

		 if(arr[i]%2==0){

			 arr[i]=0;

		 }else{

			 arr[i]=1;

		 }

	 }

	 System.out.println("Array elements are :");

	 for(int i=0;i<arr.length;i++){

		 System.out.print(arr[i]+" ");

	 }

     }

}
