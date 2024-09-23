import java.util.*;
class Allsum{

	public static void main(String[] args){
 

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the digit=");

		long number=sc.nextLong();

		long divisor=1;

                long sum=0;

		while(number/divisor>10){

			divisor*=10;

		}

		while(number>0){

			long digit=number/divisor;

			sum=sum+digit;

			number=number%divisor;



			divisor/=10;

                       }
		System.out.println("sum of each digit="+sum);

	}


		


	
}
