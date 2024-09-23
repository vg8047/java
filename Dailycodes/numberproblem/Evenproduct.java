
import java.util.*;
class Sum{

	public static void main(String[] args){
                
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number=");

		int number=sc.nextInt();

		int product=1;
                 
		int Sum=0;

		while(number>0){

			int digit=number%10;
                          
	                  if(digit%2==1){

				   Sum+=digit;
			  }else{
				  product*=digit;
			  }

			number=number/10;

		}

		System.out.println(" the sum of  odd digit ="+Sum);
		System.out.println("the product of even digit="+product);

		
	
	}
}


