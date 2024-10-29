import java.util.*;

class Demo{

	 public static void main(String[] args){

		 Scanner sc = new Scanner(System.in);

		 System.out.print("Enter the no. of rows=");

		 int rowcount=sc.nextInt();


		 for(int i=1;i<=rowcount;i++){

			int count=1;
			char ch='a';

			 for(int j=0;j<=rowcount-i;j++){

				 if(j%2==1){

					 System.out.print(ch +" " );
					 ch++;
				 
				 }else{
					
					 System.out.print(count+" ");
					 count++;
				 }
			 }
			 System.out.println();

		 }
	 }
}


