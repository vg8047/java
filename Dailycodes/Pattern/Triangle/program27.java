import java.util.Scanner;

class Demo{
   
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of rows");

		int count =sc.nextInt();

		for(int i=0;i<count;i++){

			int capital=64+count-i;

			int small = 96+count-i;

			for(int j=0;j<count-i;j++){

                                     if((count-i)%2==0){

					     System.out.print((char)capital + " ");

				     }else{
					     System.out.print((char)small + " ");

				     }

				     capital--;
				     small--;
			}
		System.out.println();
		}
	}
}

