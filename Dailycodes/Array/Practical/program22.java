import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		System.out.print("the size of array is = ");

		int size = sc.nextInt();

	        int arr[] = new int[size];

		int count =0;

	for(int i=0;i<arr.length;i++){

		arr[i] = sc.nextInt();

	}

	 for(int i=1;i<arr.length;i++){

		 if(arr[0] > arr[i]){

			 count++;
		 }
	 }

	 if(count>0){

               System.out.println("the given array is not in ascending order");
            
	 }else{
		 System.out.println("the given array is in ascending order");
	 }
     }
   }



