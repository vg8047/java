import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array = ");

		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0;i<size;i++){

			arr[i] = sc.nextInt();

		}

		int firstmax = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		int thirdmax = Integer.MIN_VALUE;

		for(int i=0;i<size;i++){

			if(arr[i]>firstmax){

                               
                                thirdmax = secondmax;
				secondmax =firstmax;
				firstmax = arr[i];
				

			}else if(arr[i]>secondmax && arr[i]!=firstmax){

				thirdmax = secondmax;

				secondmax = arr[i];

			}else if(arr[i]>thirdmax && arr[i]!=firstmax && arr[i]!=secondmax){

				thirdmax=arr[i];
			}
		}

		
	
	System.out.println("the thirdmax is = "+thirdmax);

	}
}

		
