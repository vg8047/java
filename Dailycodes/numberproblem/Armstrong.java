import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

                int count = 0;

		int value = number;

		int sum = 0;

	

		while(number>0){

                   count++;

                   number = number/10;

		}

		while(value>0){

		       int digit = value%10;

		       int digitmulti = digit;

		       for(int i=1;i<count;i++){

		             digitmulti = digitmulti*digit;
		       }

		       sum = sum+digitmulti;

		       value = value/10;

		}

                  System.out.println(sum);

	}
}	
