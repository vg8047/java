import java.util.scanner;

class Demo{

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		System.out.print("give me your budget ");

		int budget = sc.nextInt();

		switch(budget){

			case 15000:

				   System.out.println("destination is jammu and kashmir");
				   break;

		         case 10000:
				   System.out.println("destination is Manali");
				   break;

			case 6000:
				   System.out.println("destination is Amritsar");
                                   break:

			case 2000:
				   System.out.println("destination is Mahabaleshwar");
				   break;

			default:
				   System.out.println("try next time");
				   break;

		}
	}
}
