import java.util.*;
class Demo{

	static void fun(){

		System.out.println("start fun");

	        Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int y = sc.nextInt();

		try{

		     System.out.println(x/y);

		}

		catch(ArithmeticException e){
			System.out.println("zero taku nako");

			y = sc.nextInt();

			System.out.println(x/y);

		}
		System.out.println("end fun");

	}

	public static void main(String[] args){

		fun();

	}
}
