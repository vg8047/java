import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no of rows=");

		int rowcount=sc.nextInt();

        for(int i=1;i<=rowcount;i++){

		for(int space=1;space<i;space++){

			System.out.print("\t");

		}

		    for(int j=1;j<=(2*(rowcount-i)+1);j++){

			    System.out.print("*"+"\t");

		    }

		    System.out.println();
	   }
	}
}