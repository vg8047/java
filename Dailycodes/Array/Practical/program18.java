import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array");

		int size = sc.nextInt();

	        char []arr = new char[size];

	for(int i=0;i<arr.length;i++){

		arr[i] = sc.next().charAt(0);

	}

	System.out.print("characters in the uppercase = ");

	 for(int i=0;i<arr.length;i++){

		 System.out.print(Character.toUpperCase(arr[i])+" ");

	 }
	
       }
}


