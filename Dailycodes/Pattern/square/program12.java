import java.util.*;

class Demo{

	public static void main(String[] args){

	                 
		             Scanner sc = new Scanner(System.in);

			     System.out.print("Enter the no of rows=");

			     int rowcount=sc.nextInt();

			     int count=rowcount;

			for(int i=1;i<=rowcount;i++){

				for(int j=1;j<=rowcount;j++){

					if(j>rowcount-i){

						System.out.print((char)(64+count)+"\t");

					}else{
						System.out.print((char)(96+count)+"\t");

					}

					count++;

				}

				System.out.println();
			}
	         }
          }

