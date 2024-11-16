import java.util.*;

class Demo{

	  public static void main(String[] args){

		  Scanner sc = new Scanner(System.in);

		  System.out.print("Enter the no of rows=");

		  int rowcount=sc.nextInt();

		  int count=rowcount;

	  for(int i=1;i<=rowcount;i++){

		  for(int j=1;j<=rowcount;j++){

                         if(count%3==0){

				 System.out.print(count*3+" ");

			 }else if(count%5==0){
				 
				 System.out.print(count*5+" ");

			 }else{
				 System.out.print(count+" ");

			 }

			 count++;
		  }

		  System.out.println();

	  }
     }

}
