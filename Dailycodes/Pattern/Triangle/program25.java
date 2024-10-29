import java.util.*;

class Demo{

	 public static void main(String[] args){

		 Scanner sc = new Scanner (System.in);

		 System.out.print("Enter the rowcount no=");

		 int rowcount = sc.nextInt();

	

		 for(int i=0;i<rowcount;i++){

           	     int count=rowcount-i;

		     int character = 64 +rowcount-i;

			 for(int j=1;j<=rowcount-i;j++){

				 if(i%2==1){

					 System.out.print((char)character + " " );

				 }else{

					 System.out.print(count + " ");

				 }

				 character--;
				 count--;
			 }
		 System.out.println();
		 }
	 }
}



