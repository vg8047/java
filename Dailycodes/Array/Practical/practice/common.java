import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array1 ");

		int arr1size = sc.nextInt();

		System.out.print("Enter the size of array2 ");

		int arr2size = sc.nextInt();

		int arr1[] = new int[arr1size];

		int arr2[] = new int[arr2size];

		System.out.print("enter array 1 elements = ");

		for(int i=0;i<arr1.length;i++){

			arr1[i] = sc.nextInt();

		}

		System.out.print("enter array 2 elements = ");

		for(int i=0;i<arr2.length;i++){

			arr2[i] = sc.nextInt();

		}

		int count = 0;

		System.out.println("common elements are = ");

		for(int i=0;i<arr1.length;i++){

			for(int j=0;j<arr2.length;j++){

				if(arr1[i]==arr2[j]){

					count++;
					System.out.print(arr1[i] + " ");
					break;
				}
		         }

		}

              

	       if(count == 0){

		       System.out.println("no common element found");

	       }


	}
}

                  		       
