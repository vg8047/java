import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number=");

		int number = sc.nextInt();

		int remainder=0;
                   
		int value=0;

                int quotient = number;

		while(quotient>0){

			
		        //  remainder=quotient%10;

			  value=value*10+remainder+quotient%10;

			  quotient=quotient/10;

		       
                 }

		System.out.print(value);

		if(number==value){
			
		    System.out.println("the number is palindrome no");
		
		}else{
			System.out.println("the number is not palindrome no");

		}
	}
    }



