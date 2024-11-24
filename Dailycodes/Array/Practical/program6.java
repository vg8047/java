import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc  = new Scanner(System.in);

		System.out.print("Enter the size of array: ");

		int size = sc.nextInt();

		int arr[] = new int[size];

		int count=0;

	for(int i=0;i<arr.length;i++){

		arr[i] = (char) sc.next().charAt(0);

	}

	System.out.print("Array elements are : ");

	for(int i=0;i<arr.length;i++){

		System.out.print((char)arr[i]+"  ");

	}

	System.out.println();

	System.out.print("consonants are follows : ");

	for(int i=0;i<arr.length;i++){

if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){

	        count++;	

	}else{
		System.out.print((char)arr[i]+" ");

	}

         
        if(count==0){

		System.out.println("There is no consonant ");

	}

	}

   }

}
