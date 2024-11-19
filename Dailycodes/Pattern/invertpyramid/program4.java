import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                      
		System.out.print("Enter the no of rows=");

		int rowcount=Integer.parseInt(br.readLine());
                
		int count=rowcount;

	for(int i=1;i<=rowcount;i++){

		for(int space=1;space<i;space++){

			System.out.print("\t");

		}
	           
		    for(int j=1;j<=(2*count-1);j++){

                             System.out.print(rowcount-i+1+"\t");

		    }

		    count--;

		    System.out.println();
	   }
      }
}
