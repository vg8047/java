import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);


		System.out.print("enter size of array = ");

		int size = sc.nextInt();

		int arr[] = new int[size];

	for(int i=0;i<arr.length;i++){

		arr[i] = sc.nextInt();

	}

      for(int i=0;i<arr.length;i++){

	   if(arr[i]>=2){

	      int num = arr[i];

	      boolean isprime = true;

	 for(int j=2;j<num/2;j++){

		 if(num%j==0){

		        isprime = false;
	
		 }
	 }

	 if(isprime){

		 System.out.println("the index of first prime number = "+ i);

		 break;

	 }

	}

      }
  }
}
