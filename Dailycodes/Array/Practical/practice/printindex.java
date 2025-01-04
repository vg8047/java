import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		System.out.print("Enter the size of array = ");

		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the array elements = ");

		for(int i=0;i<size;i++){

			arr[i] = sc.nextInt();

		}

		System.out.print("Enter the number = ");

		int usernum = sc.nextInt();

		int count = 0;

		for(int i=0;i<size;i++){

                           if(arr[i]%usernum==0){

				   System.out.println("the multiple found at index = "+i );
				   count++;

			   }

		}

		if(count == 0){

			System.out.println("no multiple found ");

		}
	}
}

