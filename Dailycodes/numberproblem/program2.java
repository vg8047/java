import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number you want to check=");

		int number = sc.nextInt();

		if(number%number==0 && number%1==0){

			System.out.print(number+"  number is prime number");

		}else{

			System.out.print(number+" is not a prime number");
		}

	}
}
