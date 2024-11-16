import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows=");

		int rowcount = sc.nextInt();

		

	   for(int i=1;i<=rowcount;i++){

		   int num=1;

		     for(int space =0; space<rowcount-i;space++){

			     System.out.print("\t");

		     }
		       for(int j=1;j<=(2*i-1);j++){

			       if(i%2==1 ){
				       
				       System.out.print((char)(64+num)+"\t");

			       }else{
				       System.out.print((char)(96+num)+"\t");
			       }

			       if(j<i){
				       num++;

			       }else{
				       num--;
			       }

		       }

		       System.out.println();

	   }
       }
}
                                                         
