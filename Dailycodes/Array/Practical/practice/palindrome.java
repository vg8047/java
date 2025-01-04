import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		System.out.print("Enter the size of array = ");

		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the array elements = ");

		for(int i=0;i<size;i++){

		        arr[i] =sc.nextInt();
		}

		int count = 0;


               for(int i=0;i<size;i++){

		       int temp = arr[i];

		       int reverse = 0;
		 
			while(temp>=1){

			 reverse =reverse*10+temp%10;

			 temp /=10;

			}

		    if(reverse == arr[i]){

                           count++;
                     }

	       }

	       System.out.println("the count of palindrome no = "+count);


	}

			
}

