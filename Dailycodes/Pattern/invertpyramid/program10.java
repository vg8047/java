import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows=");

		int rowcount=sc.nextInt();

		int count=rowcount;

		

	for(int i=1;i<=rowcount;i++){
                
		int value=rowcount-i+1;
		

		for(int space=1;space<i;space++){

			System.out.print("\t");
		}
		 
		       for(int j=1;j<=(2*count-1);j++){

                          System.out.print(value+"\t");

		       if(j<rowcount-i+1){

			      value--;
			       
			  
			}else{
				value++;
				

                             }
		        }
		       
		       count--;
		       System.out.println();
	   
	}
   }
}