import java.util.*;
class Demo{

	public static void main(String[] args){

                 Scanner sc = new Scanner(System.in);

		 int num = sc.nextInt();

		 switch(num){

		         case 0:
				 System.out.println("zero");
				 break;

			case 1:
				 System.out.println("One");
				 break;

			case 2:
				 System.out.println("two");
				 break;
			case 3:
				 System.out.println("three");
				 break;

			case 4:
				 System.out.println("four");
				 break;
			case 5:
				 System.out.println("five");
				 break;

		         default:
				 System.out.println(num+ "is greater than 5");
				 break;
				 
		 }
	}
}
