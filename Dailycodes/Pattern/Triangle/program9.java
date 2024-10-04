import java.util.*;

class Pattern{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the row no=");

		int row = sc.nextInt();

                  

		for(int i=row;i>=1;i--){

	                   

			for(int j=1;j<=i;j++){

				int ch=64;

				if(row%2==0){

				                 if( (row+i+j)%2==0 ){


				                    System.out.print((char)( ch+row-i+j)+" ");
			    
			                     }else{

				               System.out.print((ch+row-i+j)+" ");

			                  }

				}else{

					if( (row+i+j-1)%2==0){


                                            System.out.print((char)( ch+row-i+j)+" ");

                                     }else{

                                        System.out.print((ch+row-i+j)+" ");

                                 }
			}

			}
                          
		       	System.out.println();

		

	}	
 }	
}
