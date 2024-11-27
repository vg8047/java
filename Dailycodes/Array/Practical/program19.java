import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc  = new Scanner(System.in);

		System.out.println("Enter the size of array ");

		int size = sc.nextInt();

		char []arr= new char[size];

		int count = 0;

	for(int i=0;i<arr.length;i++){

		arr[i] = sc.next().charAt(0);

	}

	  System.out.print("Enter the character you want to search = ");

	  char letter = sc.next().charAt(0);

	  for(int i=0;i<arr.length;i++){

		  if(letter == arr[i]){

			  count++;

		  }
	  }

	  System.out.println("the letter "+letter+" is occured "+count+" times ");

	}
}
