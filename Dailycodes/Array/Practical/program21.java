import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array = ");

		int size = sc.nextInt();

		char arr[] = new char[size];

		int count =0;

	for(int i=0;i<arr.length;i++){

		arr[i] = sc.next().charAt(0);

	}

	 System.out.print("enter the letter = ");

	 char letter = sc.next().charAt(0);

	 System.out.println("the character before the "+letter);

	 for(int i=0;i<arr.length;i++){

		 if(arr[i] == letter){

			 count = i;

		 }
	 }
      
	 for(int i=0;i<count;i++){

		 System.out.println(arr[i]+" ");

	 }

      }
}
