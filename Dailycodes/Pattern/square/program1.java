import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rowcount:");

		int rowcount = sc.nextInt();

         for(int i=1;i<=rowcount;i++){

		 for(int j=1;j<=rowcount;j++){

			 if(i%2==1){

				 System.out.print((char)(65+rowcount-j)+"\t");

			}else{
                                System.out.print(rowcount +"\t");
			}

		 }
	  System.out.println();
	 }
      }
}    
                               
