import java.util.*;
class Factor{


	public static void main(String[] args){
                  
		Scanner sc = new Scanner(System.in);

		int factor = 1;

		int number = sc.nextInt();

		for(int i = number;i>=1;i--){

			factor = factor*i;

		}

		System.out.println(factor);
	}
}
