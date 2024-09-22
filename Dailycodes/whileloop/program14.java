class Demo{

	public static void main(String[] args){

		int num1=1;
		int count=1;

		while(num1<=4){

			int num2=1;

			while(num2<=4){

				System.out.print(count +"\t");

				count+=2;

				num2++;

			}

			num1++;
			System.out.println();

		}
	}
}
