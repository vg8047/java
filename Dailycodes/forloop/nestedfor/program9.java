class Demo{
	
	public static void main(String[] args){

		for(int i=0;i<=3;i++){

			char ch1='A';
			char ch2='a';

			for(int j=0;j<=3;j++){

				if(i%2==1){

					System.out.print(ch2++ +" ");
				}else{
					System.out.print(ch1++ +" ");

				}

			}

			System.out.println();

		}
	}
}
