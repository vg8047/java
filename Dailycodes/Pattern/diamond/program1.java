import java.util.*;

class Demo{

	  public static void main(String[] args){

		  Scanner sc = new Scanner(System.in);

		  System.out.print("Enter the no of rows=");

		  int rowcount = sc.nextInt();

		  int space=0;

		  int cols=0;

           for(int i=1;i<2*rowcount;i++){

		   if(i<=rowcount){
                                
			   space=rowcount-i;
			   cols=i*2-1;

		   }else{
			   space=i-rowcount;
			   cols=cols-2;
		   }

		   for(int sp=1;sp<=space;sp++){

			   System.out.print("\t");
		   }
		    
		      for(int j=1;j<=cols;j++){

			      System.out.print("#"+"\t");
		      }

		System.out.println();

	   }
    }

 }

		     
