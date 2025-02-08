import java.util.*;

class Demo{

	static void fun(){

		System.out.println("start fun");

		int x = 0;

		int y = 0;

		Scanner sc = new Scanner(System.in);

		try{

			x = sc.nextInt();
			y = sc.nextInt();

		}catch(InputMismatchException e){
			
			System.out.println("input mismatch");

		}

		try{
			System.out.println(x/y);

		}

		catch(ArithmeticException e){


			System.out.println("0 taku nako");

                 }

	}


	public static void main(String[] args){

		fun();

	}

}
