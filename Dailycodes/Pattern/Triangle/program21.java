import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of rows= ");

		int rowcount= sc.nextInt();


		for(int i=1;i<=rowcount;i++){

			char capital='A';
			char small='a';

			for(int j=0;j<=rowcount-i;j++){

				if(i%2==1){

                                       System.out.print(capital+" ");
				       capital++;

				}else{
					System.out.print(small+" ");
					small++;

				}
			}
			System.out.println();
		}
	}
}
