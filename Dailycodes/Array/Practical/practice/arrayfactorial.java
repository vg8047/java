import java.util.*;

class Demo{

	static int factorial(int num){

		int sum =1;

		for(int i=num ;i>=1;i--){

			sum = sum*i;

		}

		return sum;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array = ");

		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0;i<size;i++){

			arr[i] = sc.nextInt();

		}

		System.out.println("factorial are ");

		for(int i=0;i<arr.length;i++){

			System.out.println(factorial(arr[i])+" ");

		}
	}
}
