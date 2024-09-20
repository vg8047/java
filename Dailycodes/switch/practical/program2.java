import java.util.*;

class Demo{

	public static void main(String[] args){
             
		Scanner sc = new Scanner(System.in);

		char grade=sc.next().charAt(0);

		switch(grade){

			case 'O':
				System.out.println("outstanding");
				break;

			case 'A':

				System.out.println("excellent");
				break;

			case 'B':
				System.out.println("first class");
				break;

			case 'P':

				System.out.println("pass");
				break;

		}
	}
}

