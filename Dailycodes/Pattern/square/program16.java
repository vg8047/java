import java.util.*;

class Demo{

	public static void main(String[] args){

	                 
		             Scanner sc = new Scanner(System.in);

			     System.out.print("Enter the no of rows=");

			     int rowcount=sc.nextInt();

			     int count=rowcount;

			for(int i=1;i<=rowcount;i++){

				for(int j=1;j<=rowcount;j++){

					if(i%2==1 && j%2==0){

						System.out.print("$"+"\t");
						count++;

					}else{
						System.out.print(count+"\t");

					}

				

				}

				System.out.println();
			}
	         }
          }

