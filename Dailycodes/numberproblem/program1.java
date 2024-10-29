import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner (System.in);

		System.out.print("Enter the no of rows=");

		int count = sc.nextInt();

		int factor=1;

		for(int i=1;i<=count;i++){

			if(count%factor==0){
				
				System.out.print(factor+","+" ");

			}
			factor++;

		}
		System.out.println();
	}
}


