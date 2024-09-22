class Eachdigit{

	public static void main(String[] args){
		 
		int num=9307;

		int lastdigit=0;

		while(num>0){

			lastdigit=num%10;

			System.out.println(lastdigit+ " ");

			num=num/10;

		}
	}
}


			
