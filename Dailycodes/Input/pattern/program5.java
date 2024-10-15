import java.util.Scanner;

class Demo{

	public static void main(String[] args){

		Scanner rowno = new Scanner(System.in);

		System.out.print("Enter the no of rows=");

		int row = rowno.nextInt();

	

		for(int i=1;i<=row;i++){

                   
                         
		  int ALPHA=64+row;
		  int alpha=96+row;

			for(int j=1;j<=i;j++){


				
				if(i%2==0){
                                      

                                        System.out.print((char)ALPHA+" ");
					ALPHA--;

				}else{

                                       
					System.out.print((char)alpha+" ");
					alpha--;

				}

			}
			System.out.println();
		}
	}
}

