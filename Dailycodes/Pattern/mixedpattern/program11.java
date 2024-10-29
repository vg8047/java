import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows=");

		int count = sc.nextInt();

	        

                 while(count>0){

			 int remainder = count%10;

			 if(remainder%2==1){

				 System.out.println("the square of the odd number"+remainder+"="+remainder*remainder );

			 }
                            
			 count=count/10;

		 }

		
	}
}
			 
