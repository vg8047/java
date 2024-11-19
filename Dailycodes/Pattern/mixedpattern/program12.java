import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows=");

		int rowcount=sc.nextInt();

		int count=1;

          for(int i=1;i<=rowcount;i++){

		  for(int space=0;space<rowcount-i;space++){

			  System.out.print("\t");

		  }
	   for(int j=1;j<=i;j++){

		   System.out.print(count+"\t");

		   count+=2;

	   }

        System.out.println();
	  
	  }

       }

   }      
       
	  
