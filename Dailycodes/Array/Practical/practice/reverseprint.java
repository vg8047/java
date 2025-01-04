import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		System.out.print("Enter the size of array = ");

		int size = sc.nextInt();

		char arr[] = new char[size];

		System.out.println("Enter the array elements = ");

		for(int i=0;i<size;i++){

		        arr[i] =sc.next().charAt(0);
		}

		System.out.println("Array elements before reverse");

		for(int i = 0;i<size;i++){

			if(i%2==0){

				System.out.println(arr[i]);

			}
		}

		char temp ;

		for(int i=0;i<size/2;i++){

                          temp = arr[i];

			  arr[i] = arr[size-1-i];

			  arr[size-1-i] = temp;

		}

		System.out.println("array alternate elements after reverse");

	         for(int i=0;i<size;i++){

			  	if(i%2==0){

				System.out.println(arr[i]);
				
				}


			}
		

		
	}
}

