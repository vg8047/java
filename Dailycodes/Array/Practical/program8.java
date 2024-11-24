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

	System.out.println();
              
	for(int i=0;i<arr.length;i++){
                 
		int count=0;

		int value=1;

		for(int j=1;j<=arr[i];j++){

                     if(arr[i]%value==0){

			  count++;

			  value++;

			  }
                  }

		if(count>=2){

			System.out.print(arr[i]+" ");

		}

	

            }

	 }

    }
    
