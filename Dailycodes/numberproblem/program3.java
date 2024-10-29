import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number=");

		int number = sc.nextInt();

		int count=1;

		for(int i=1;i<=20;i++){


		     if(number%count==0 && number%1==0){


                            count++;

		     }
		}
		
		if(count>=3){

			System.out.println(number+" is a composite number");

		}else{
			System.out.println(number+" is not a composite number");

		}
	}
}

