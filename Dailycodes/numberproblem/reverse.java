class Demo{


	public static void main(String[] args){

		int number=1;

		int x =2;

		int value = 0;

		while(x/number>=10){

			number*=10;

		}

		

		while(x>0){

			value=x/number;

			System.out.println(value);
                     
			x=x%number;

			number = number/10;

		}
		      
          }
}
