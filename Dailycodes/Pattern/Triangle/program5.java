import java.util.*;

class Demo{

	public static void main(String [] args){

	       Scanner sc = new Scanner(System.in);

	       System.out.print("Enter the no of rows=");

		int row = sc.nextInt();
             
		for(int i=1;i<=row;i++){

			
                          for(int j=1;j<=i;j++){
                              
			         
				
			        System.out.print(row*j +" ");

				

			      }
                       
		        

			System.out.println();

		}
	}
}
						 

