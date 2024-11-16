import java.util.Scanner;

class Space{

	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the no of rows=");

		int rowcount=input.nextInt();

		for(int i=0;i<rowcount;i++){

			int character=65+i;
			
			for(int space=0;space<i;space++){

				System.out.print(" "+" ");

			}
		     for(int j=0;j<rowcount-i;j++){

			  if((rowcount+j+i)%2==0){

				System.out.print(character+" ");

			 }else{
				System.out.print((char)character+" ");
			}

			character++;

	           }
		System.out.println();
		
		}

	}
}
