import java.util.*;
class Oddprint{

	public static void main(String[] args){
 

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the digit");

		int number=sc.nextInt();

		int divisor=1;

		while(number/divisor>10){

			divisor*=10;

		}

		while(number>0){

			int digit=number/divisor;

			if(digit%2==1){

			System.out.println(digit);

			}


			number=number%divisor;

			divisor/=10;

		}

	}
}
