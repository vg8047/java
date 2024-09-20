class Demo{

	public static void main(String[] args){
                    
		int num1=1;

		int num2=65;

		for(int i=1;i<=4;i++){

		
                    for(int j=1;j<=3;j++){

		          	   if(i%2==0){

			              	   System.out.print((char)num2+" ");

					   num2++;

				   }else{
					   System.out.print(num1+" ");
					   num1++;

				   }

			   
		   }
		   System.out.println();
		}
	}
}

