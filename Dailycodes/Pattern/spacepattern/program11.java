import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows=");

		int rowcount = sc.nextInt();

		int character=65;

		for(int i=0;i<rowcount;i++){

			for(int space=1;space<=i;space++){

				System.out.print(" "+" ");

			}

			for(int j=0;j<rowcount-i;j++){

				if((rowcount+j+i)%2==0){


				System.out.print((character+j+i)+ " ");

				}else{
					System.out.print((char)(character+j+i)+ " ");

				}
				

			}
			System.out.println();
		}
	}
}
