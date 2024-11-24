import java.util.*;
class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no you want to search= ");

		int number = sc.nextInt();
		
		int arr[] = new int[7];

		int count=0;

		arr[0] = 2;

		arr[1] = 5;

		arr[2] = 2;

		arr[3] = 7;

		arr[4] = 8;

		arr[5] = 9;

		arr[6] = 2;

	for(int i=0;i<arr.length;i++){

              if(arr[i] == number){

		      count++;

	      }

	}

	if(count>0){

		System.out.println("Number "+number+" occured "+count+" times in an array");

	}else{
		System.out.println("num not found ");

	}

    }

}
