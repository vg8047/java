import java.util.*;

class Demo{

	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("enter the dayno: ");

		int num=sc.nextInt();

		switch(num){

			case 1:
				System.out.println("monday");
                                break;

			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("wednesday");
				break;

			case 4:
				System.out.println("Thursday");
				break;

			case 5:
				System.out.println("friday");
				break;
			case 6:
				System.out.println("saturday");
				break;
			case 7:
				System.out.println("sunday");
				break;
			default:
				System.out.println("enter the daynumber in between 1 to 7");
				break;

		}
	}
}
