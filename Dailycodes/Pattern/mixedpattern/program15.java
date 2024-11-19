import java.util.*;

class Demo{

	 public static void main(String[] args){

		 Scanner sc = new Scanner(System.in);

		 System.out.print("Enter the no of rows=");

		 int rowcount=sc.nextInt();

		 int count=rowcount;

         for(int i=1;i<=rowcount;i++){

		
            for(int j=1;j<=rowcount;j++){
                    
		    if(i%2==1){

                         System.out.print(count*count+"\t");

                     }else{
			     System.out.print(count+"\t");
		     }
		count++;
	    }	
	    System.out.println();
	 }
    }

}   
            	    
