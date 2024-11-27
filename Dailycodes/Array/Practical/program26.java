import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println(System.in);

		System.out.println("enter size of array = ");

		int size = sc.nextInt();

		int arr[] = new int[size];

	for(int i=0;i<arr.length;i++){

		arr[i] = sc.nextInt();

	}

	 for(int i=2;i<arr[i]/2;i++){

		 if(arr[i]%i==0){

		 }else{
			 System.out.println("the first prime number "+i);
			 break;
		 }

	 }
  }
}
