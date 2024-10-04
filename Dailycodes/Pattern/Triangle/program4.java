import java.util.*;

class Demo{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the rows=");

		int row = sc.nextInt();

		
             
		for(int i=0;i<row;i++){

			int ch=65;

		         ch=ch+i;

			for(int j=0;j<=i;j++){
                                  
				
			                   	
				System.out.print((char)ch +" ");
				ch++;

				}
                       
		        

			System.out.println();

		}
	}
}
						 

