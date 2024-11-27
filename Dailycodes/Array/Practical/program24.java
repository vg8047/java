import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("enter size of array = ");

		int size = sc.nextInt();

		int arr[] = new int[size];

		int count=0;

	for(int i=0;i<arr.length;i++){

		arr[i] = sc.nextInt();

	}

	 for(int i=0;i<arr.length/2;i++){

		 if(arr[i] == arr[size-i-1]){

			 count=0;

		 }else{

			 count++;
		 }
	 }

	 if(count==0){

		 System.out.println("the array is palindrome ");

	 }else{

		 System.out.println("the array is not palindrome ");

	 }
     }
  }
