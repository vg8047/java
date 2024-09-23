import java.util.*;

class Oddprint{

	public static void main(String[] args){

		
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter the number=");

		int number=sc.nextInt();

		while(number>0){

			int lastdigit= number%10;

			if(lastdigit%2==1){

				System.out.println(lastdigit+ " ");

			}

			number=number/10;

		}
	}
}

		
