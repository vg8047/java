import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows=");

		int rowcount = sc.nextInt();
             
		int count = rowcount;
                   
		for(int i=1;i<=rowcount;i++){


			for(int j=1;j<=i;j++){

			System.out.print(count*j+" ");
                        
			
                       }

		       count--;

		      System.out.println();
		}
	}
}