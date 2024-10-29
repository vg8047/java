import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number=");

		int number = sc.nextInt();

		int remainder=0;

		int quotient = number;

		for(int i=0;i<=quotient;i++){

			
		          remainder=quotient%10;

			  System.out.print(remainder +" ");

			  quotient=quotient/10;


		}
		System.out.println();
	}
    }



