import java.util.*;

class Demo{


	static boolean isprime(int num){

		if(num<=1){

			return false;

		}else{
			for(int i=2;i<num/2;i++){

				if(num%i==0){
					
					return false;

				}
			}
		}

	return true;
}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array ");

		int size = sc.nextInt();

		int arr[] = new int [size];

		int sum = 0;

		int count = 0;

		for(int i=0;i<arr.length;i++){

			arr[i] = sc.nextInt();

		}

		for(int i=0;i<arr.length;i++){

                      if(isprime(arr[i])){

			      sum = sum + arr[i];
			      count++;

		      }
                  }

		if(count ==0){
			
			System.out.println("there is no prime number ");
		}else{

		System.out.println("the sum of prime = "+sum);
		System.out.println("the no of prime are = "+count);
              }
	}
}

                  		       
