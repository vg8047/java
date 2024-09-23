
import java.util.*;
class Sum{

	public static void main(String[] args){
                
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number=");

		int number=sc.nextInt();
                 
		int Square=0;

		while(number>0){

			int digit=number%10;
                          
	                  if(digit%2==1){

				   Square= Square+digit*digit;
			  }
			

			number=number/10;

		}

		System.out.println(" the sum of Square of odd digit ="+Square);

		
	
	}
}


