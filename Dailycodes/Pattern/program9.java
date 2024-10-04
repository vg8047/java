import java.util.*;

class pattern9{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the row number=");
		int row = sc.nextInt();

		int count=1;

		for(int i=0;i<row;i++){

			for(int j=0;j<row;j++){

				System.out.print(count+" ");

				count++;

			}


                        count--;
			System.out.println();
		}
	}
}


