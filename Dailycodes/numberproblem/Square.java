
import java.util.*;
class Square{

	public static void main(String[] args){
                
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number=");

		int number=sc.nextInt();


		while(number>0){

			int digit=number%10;

			if( digit%2==1){

				System.out.println("squares of odd="+digit*digit);
			}

			number=number/10;

		}
		
	}
}


