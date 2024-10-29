import java.util.*;

class Inverttriangle{

	public static void  main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows=");

		int rowcount = sc.nextInt();

		for(int i=1;i<=rowcount;i++){

			int count=0+i;

			for(int j=0;j<=rowcount-i;j++){

				System.out.print(count+" ");
				count++;

			}
			System.out.println();
		}
	}
}
