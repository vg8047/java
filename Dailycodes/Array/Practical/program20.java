import java.util.*;

class Demo{

	public static void main(String[] vg){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array = ");

		int size = sc.nextInt();

		char arr[] = new char[size];

	for(int i=0;i<arr.length;i++){

		arr[i] = sc.next().charAt(0);

	}

	 for(int i=0;i<arr.length;i++){

		 if(arr[i] < 97 || arr[i] > 122){

			 arr[i] = '#';

		 }
	 }

	  for(int i=0;i<arr.length;i++){

		  System.out.print(arr[i]+" ");

	  }
	}
}
