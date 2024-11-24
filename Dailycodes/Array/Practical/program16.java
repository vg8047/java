import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array ");

		int size = sc.nextInt();

		char arr[] = new char[size];

		int consonant = 0;

		int vowels = 0;

	for(int i=0;i<arr.length;i++){

		arr[i] = sc.nextLine();

	}

	 for(int i=0;i<arr.length;i++){

		 if(arr[i] =='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'|| arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U' ){

			 vowels++;

		 }else{

			 consonant++;
		 }
	 }

	 System.out.println("count of vowels are = "+vowels);

	 System.out.println("count of consonants are = "+consonant);

	}
}
