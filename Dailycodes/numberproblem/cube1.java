import java.util.*;
class Cube{

	public static void main(String[] args){
                
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number=");

		int number=sc.nextInt();


		while(number>0){

			int digit=number%10;

			if( digit%2==0){

				System.out.println("cube of odd"+ digit+" = "+digit*digit*digit);
			}

			number=number/10;

		}
		
	}
}
