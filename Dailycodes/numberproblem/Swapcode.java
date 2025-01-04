import java.util.*;
class Demo{

	static void Swapnumber (int num1 , int num2){

		System.out.println("the numbers before swapping "+num1+"and"+num2);

		int temp = num1;

		num1 = num2;

		num2 = temp;

		System.out.println("The numbers after the swapping "+num1+"and"+num2);

	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number = ");

		int number1 = sc.nextInt();

		System.out.print("Enter the second number = ");

		int number2 = sc.nextInt();

		Swapnumber(number1,number2);

	}
}
