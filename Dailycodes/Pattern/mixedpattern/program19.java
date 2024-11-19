import java.util.*;

class Demo{

	public static void main(String[] args){

		   Scanner sc = new Scanner(System.in);

		   System.out.print("Enter the no of rows=");

		   int rowcount=sc.nextInt();

		   

            for(int i=1;i<=rowcount;i++){

		      int count=0;

		     for(int space=rowcount-i;space>0;space--){

			     System.out.print("\t");
		     }
		 for(int j=1;j<=(2*i-1);j++){

			 System.out.print(rowcount-i+1+count+"\t");

			 count++;

		 }
		 System.out.println();
	    }
	}
}
