import java.util.*;

class Demo{

	 public static void main(String[] args){

		  Scanner sc = new Scanner(System.in);

		  System.out.print("Enter the no of rows=");

		  int rowcount=sc.nextInt();

		  

	    for(int i=1;i<=rowcount;i++){

		   

		    for(int j=1;j<=rowcount;j++){

                           if((i+j)%2==0){

				   System.out.print(2*j+"\t");

			   }else{
				   System.out.print(3*j+"\t");
			   }

			

		    }

		    System.out.println();
	    }
     }
}

