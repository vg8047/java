import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner (System.in);

		System.out.print("Enter the no of rows=");

		int rowcount=sc.nextInt();
		

	
    for(int i=1;i<=rowcount;i++){

	     int count=rowcount;
                 
		for(int space=0;space<rowcount-i;space++){

			System.out.print("\t");

		    }

			for(int j=1;j<=(2*i-1);j++){

				System.out.print(count+"\t");

				if(j<i){
				       
					count--;

				}else{
					count++;
				}


			}

		System.out.println();

          }
      }
}
