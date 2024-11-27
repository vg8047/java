import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the array size = ");

		int size = sc.nextInt();

		int arr[] = new int[size];

		int even = 0;

		int odd = 0;
	
      for(int i=0;i<arr.length;i++){

	      arr[i] = sc.nextInt();
      }

       for(int i=0;i<arr.length;i++){

	       if(arr[i]%2==0){

		       even+=arr[i];

	       }else{
		       
		       odd+=arr[i];

	       }
       }

       
       System.out.println("the sum of even is = "+even);

       System.out.println("the sum of odd is = "+odd);

	}
}

       
