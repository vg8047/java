import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array: ");

		int size = sc.nextInt();

		int arr[] = new int[size];

	for(int i=0;i<arr.length;i++){

		arr[i] = sc.nextInt();

	}

	System.out.println("Array elements are: ");

	if(size%2==0){

	    for(int i=0;i<arr.length;i++){

		    if(arr[i]%2==0){

                       System.out.print(arr[i]+" "); 

		 }
	     }

	}else{
		for(int i=0;i<arr.length;i++){

			if(arr[i]%2==1){

				System.out.print(arr[i]+" ");
			}
		}
	}

	
    }
}
