import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows=");

		int rowcount=sc.nextInt();

		int count=rowcount;

	for(int i=1;i<=rowcount;i++){

		int num=1;

		for(int space=1;space<i;space++){

			System.out.print("\t");
		}
		 
		       for(int j=1;j<=(2*count-1);j++){



		       if(j%2==0){

			      System.out.print("0"+"\t");
			       
			  
			}else{
				System.out.print("1"+"\t");
				

                             }
		        }
		       
		       count--;
		       System.out.println();
	   
	}
   }
}
