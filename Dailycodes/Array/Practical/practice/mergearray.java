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

	

		int arr3[] = new int[arr1size+arr2size];

		for(int i=0;i<arr1.length;i++){

			arr3[i] = arr1[i];


			   }

		for(int i=0;i<arr2.length;i++){

			arr3[arr1size+i] = arr2[i];
			}
		System.out.println("combined array is = ");

		for(int i=0;i<arr3.length;i++){

			System.out.println(arr3[i]);


		}


	}
}

                  		       
