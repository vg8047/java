import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number=");

		int number = sc.nextInt();

		int factno=number;

		int count=1;

		for(int i=1;i<=number;i++){

			if(number>0){

				count*=factno;

			}

			factno--;
		}

		System.out.println(count+" ");

	}
}

