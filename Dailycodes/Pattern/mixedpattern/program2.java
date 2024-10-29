import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of row=");

		int rowcount = sc.nextInt();

		int character = 64 + rowcount;

		int count = rowcount;

		for(int i=0;i<rowcount;i++){

			count=rowcount+i;

			for(int j=1;j<=rowcount;j++){

                              System.out.print((char)character+""+count+" ");

                              count--;
			}

		System.out.println();
		}
	}
}

