import java.util.*;

class Demo{

	public static void main(String[] args){
             
		Scanner sc = new Scanner(System.in);


	         System.out.print(" enter your size =");

		String  size = sc.nextLine();

		switch(size){

			case "S":
				System.out.println("small");
				break;

			case "XL":

				System.out.println("extra large ");
				break;

			case "L":
				System.out.println("large");
				break;

			case "XXL":

				System.out.println("extremely large");
				break;

		}
	}
}

