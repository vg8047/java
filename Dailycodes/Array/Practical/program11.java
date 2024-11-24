import java.util.*;

class Demo{
	
	public static void main(String[] args){

		Scanner sc = new Scanner (System.in);

		System.out.print("Enter the size of array = ");

		int size = sc.nextInt();

		int arr[] = new int[size];

		int count = 0;

	for(int i=0;i<arr.length;i++){

                  arr[i] = sc.nextInt();
                  
		  count+=arr[i];
	}

	    int average = count/size;

	    System.out.print("the average is = "+average);

	}
}
