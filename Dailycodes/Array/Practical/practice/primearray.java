import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array ");

		int size = sc.nextInt();

                int arr[] = new int[size];

		for(int i=0;i<size;i++){

			arr[i] = sc.nextInt();

		}

	        

		for(int i=0;i<size;i++){

			int count = 0;

			for(int j=2;j<arr[i];j++){

			  if(arr[i]%j==0){

				count++;

			  }

		      }

		   if(count == 0 && arr[i]!=0 && arr[i]!=1){

			   System.out.println(arr[i]);

		   }


	    }
	}
}
