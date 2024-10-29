import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no. of rows=");

		int row=sc.nextInt();

		char  count = (char)('A'+(row*(row+1)/2)-1);

		for(int i=row;i>0;i--){

			for(int j=1;j<=i;j++){

				System.out.print(count+" ");
				count--;

			}
			System.out.println();

		}
	}
}
