import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows=");

		int rowcount = sc.nextInt();

		int character = 64 + (rowcount*(rowcount+1))/2;

                 for(int i=0;i<rowcount;i++){


                    for(int j=1;j<=rowcount-i;j++){

			   System.out.print((char)character +" ");

			   character--;

		           
		        }

		       System.out.println();
		}
	}
}
