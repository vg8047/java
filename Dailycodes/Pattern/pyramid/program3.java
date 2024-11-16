import java.util.*;


class Demo{

	public static void main(String[] args){

		Scanner sc  = new  Scanner(System.in);

		System.out.print("Enter the no of rows=");

		int rowcount=sc.nextInt();

		int count=1;


	for(int i=1;i<=rowcount;i++){

		   for(int space=0;space<rowcount-i;space++){

			   System.out.print("\t");

		   }

		       for(int j=0;j<(2*i-1);j++){

			       System.out.print(count+"\t");
			       count++;

		       }

                  
		  System.out.println();

	    }
	}
  }
	
