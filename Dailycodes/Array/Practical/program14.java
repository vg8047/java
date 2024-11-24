import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array = ");

		int size = sc.nextInt();

		int arr[] = new int[size];

                int value = 0;

		int count=0;

	for(int i=0;i<arr.length;i++){

		arr[i] = sc.nextInt();

	}

	for(int i=0;i<arr.length;i++){

		count=0;

		for(int j=0;j<arr.length;j++){

			if(arr[i] == arr[j]){

				count++;
			   value = arr[i];	

			}

		}
 
            }

            if(count>2){

	            System.out.println("the number occurs more than two times is "+value);

            }

       }

}

                   
