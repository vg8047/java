import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array ");

		int size = sc.nextInt();

		int arr[] = new int [size];

		for(int i=0;i<arr.length;i++){

			arr[i] = sc.nextInt();

		}

		int count = 0;

		System.out.print("Enter the key = ");

               int key = sc.nextInt();
               
	       for(int i=0;i<size;i++){

		       if(arr[i] == key){
			       count++;

		       }

	       }

	       if(count == 0){

		       System.out.println("key not found");

	       }else  if(count>2){
		      
		       for(int i=0;i<arr.length;i++){

			       if(arr[i]==key){

				       arr[i] = key*key*key;

			       }

		          System.out.println(arr[i]);

		       }
	       }else{
		       System.out.println("element found less than 2 times");

	       }


	}
}

                  		       
