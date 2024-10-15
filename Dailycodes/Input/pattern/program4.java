import java.util.*;
 class Demo{

	public static  void main(String[] args){

		Scanner row = new Scanner (System.in);

		System.out.print("Enter the no of rows=");

                int rowno =  row.nextInt();

		for(int i=1;i<=rowno;i++){
			
		       int charvalue = 64+rowno;	

			for(int j=1;j<=i;j++){

                                    System.out.print((char)charvalue+" ");
				    charvalue--;

			}

			System.out.println();

		}
	}
}
