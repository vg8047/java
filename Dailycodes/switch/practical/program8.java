import java.util.*;

class Demo{

	public static void main(String[] args){


		Scanner sc =   new Scanner(System.in);

		System.out.println("enter the number 1 ");

		int num1 =sc.nextInt();

		System.out.println("enter the number 2 ");

		int num2 = sc.nextInt();

		if(num1>0 && num2>0){

               
			int num3 =num1*num2;

		switch(num3%2){

			case 0:
				System.out.println("number is even");
				break;

			case 1:
				System.out.println("number is odd");
				break;
                       
		
		}


	} else {
		System.out.println("Sorry negative numbers are not allowed");

	}
	}
}
