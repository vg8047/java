import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("enter size of array = ");

		int size = sc.nextInt();

		int arr[] = new int[size];

		int count=-1;

	for(int i=0;i<arr.length;i++){

		arr[i] = sc.nextInt();

	}

	 for(int i=0;i<arr.length;i++){

		 for(int j=i+1;j<arr.length;j++){

			 if(arr[i] == arr[j]){

				  count = i;
				  break;

			 }

		 }

			 if(count!=-1){

				 break;
			 }
		 }
	

	 System.out.println("first  duplicate  element occured at = "+count);

	}
}
