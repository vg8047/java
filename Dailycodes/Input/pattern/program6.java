import java.util.Scanner;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();

		int charvalue = 65+row;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=i;j++){

				System.out.print((char)charvalue+" ");
				charvalue++;


			}
			System.out.println();
		}
	}
}
