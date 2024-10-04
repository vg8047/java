import java.util.*;

class Pattern8{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of  rows=");

		int rows = sc.nextInt();

		int count=1;

		
                for(int i=1; i<=rows;i++){

		          int character=65;
                          
			  character=character+rows-1;

                  
			for(int j=1;j<=rows;j++){

				
                              System.out.print((char)character+""+count+" ");
			      count++;

				

			}

			System.out.println();
		}
	}
}


