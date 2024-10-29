import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows = ");

		int rowno = sc.nextInt();

		int count =1;

		for(int i=1;i<=rowno;i++){

			for(int j=1;j<=rowno;j++){

				System.out.print(count + " ");
				count++;

			}
		System.out.println();

		}
	}
}

