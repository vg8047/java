
import java.util.*;
class Sum{

	public static void main(String[] args){
                
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number=");

		int number=sc.nextInt();
                 
		int sum=0;

		while(number>0){

			int digit=number%10;
                          
	                  if(digit%2==0){

				  sum+=digit;
			  }
			

			number=number/10;

		}

		System.out.println(" the sum of all digit ="+sum);

		
	
	}
}


