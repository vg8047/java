import java.util.Scanner;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows=");

		int rowcount = sc.nextInt();

		int count=rowcount;
	
      for(int i=1;i<=rowcount;i++){

	      for(int space=rowcount;space>i;space--){

		      System.out.print("\t");
	      }

	   for(int j=1;j<=(2*i-1);j++){

		   System.out.print(count+j-1+"\t");

	   }
	   count--;
	   System.out.println();
       }
    }
}
