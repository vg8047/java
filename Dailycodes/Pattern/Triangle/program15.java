import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows=");

		int row = sc.nextInt();
                 

		int count=1;
		int letter=97;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=i;j++){
				 
				if(i%2==0){

					System.out.print((char)letter + " ");

				}else{
					System.out.print(count+" ");

				}
				count++;
				letter++;

			}
			System.out.println();
		}
	}
}

			
