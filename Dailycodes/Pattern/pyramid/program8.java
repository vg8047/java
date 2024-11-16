import java.util.*;

class Demo{

	public static void main(String[] args){

		  Scanner sc = new Scanner(System.in);

		  System.out.print("Enter the no of rows=");

		  int rowcount=sc.nextInt();

		  char character='A';

	  for(int i=1;i<=rowcount;i++){

		  for(int space=0;space<rowcount-i;space++){

			   System.out.print("\t");
		  }

			  for(int j=1;j<=(2*i-1);j++){

				  if(i%2==1){

                                           System.out.print(i+"\t");

				  }else{
					  System.out.print(character+"\t");

				  }
			   

			  }
	            character++;		  
	            System.out.println();
	  }
    }
}
