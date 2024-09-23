import java.util.*;

class Divisible{

	public static void  main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number=");

		int number=sc.nextInt();

		while(number>0){

			int digit=number%10;

			if(digit%3!=0){

				System.out.println(digit+ " ");

			}

			number=number/10;

		}

	}
}


