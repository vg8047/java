import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows=");

		int rowcount=sc.nextInt();

	        int space=0;

		int value=0;

		int count=1;

		for(int i=1;i<=2*rowcount-1;i++){

			
			if(i<=rowcount){

				space=rowcount-i;

				value=2*i-1;

			}else{

				space=i-rowcount;

				value=value-2;

			}

		 for(int sp=1;sp<=space;sp++){

			 System.out.print("\t");
		 }

		   for(int j=1;j<=value;j++){

			   System.out.print(count+"\t");
			   count++;

		   }

		   

		   System.out.println();
		}
	}
}
