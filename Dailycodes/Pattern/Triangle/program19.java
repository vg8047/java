import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows=");

		int rowcount=sc.nextInt();

		int count = rowcount *(rowcount+1);


		for(int i=1;i<=rowcount;i++){

			for(int j=0;j<=rowcount-i;j++){

				System.out.print(count + " ");

				count-=2;

			}
			System.out.println();

		}
	}
}
