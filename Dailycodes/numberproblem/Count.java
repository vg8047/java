import java.util.*;
class Count{

	public static void main(String[] args){
 

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the digit=");

		int number=sc.nextInt();

		int divisor=1;

		int oddcount=0;

		int evencount=0;

		while(number/divisor>10){

			divisor*=10;

		}

		while(number>0){

			int digit=number/divisor;

			if(digit%2==0){

			 evencount++;

			}else{
                               
				oddcount++;

			}

                         number=number%divisor;

			divisor/=10;

		}

		System.out.println("odd count="+oddcount);
		System.out.println("even count="+evencount);


	}
}
