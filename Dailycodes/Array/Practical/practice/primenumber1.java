import java.util.*;
class Demo{

        static boolean isprime(int num){

		if(num<=1){

			return false;

		}else{
			for(int i=2;i<=num/2;i++){
				 
				 if(num%i == 0){

					 return false;

				 }

			}

		}

		return true;

	}


	public static void main(String[] args){

             Scanner sc = new Scanner(System.in);

	     System.out.println("Enter the number = ");

	     int number = sc.nextInt();

	     if(isprime(number)){

		     System.out.println("the number is prime ");

	     }else{

		     System.out.println("the number is not prime");

	     }
	}
}
