class Demo{

	int x = 10;

	 Demo(){
          
		 System.out.println("in constructor");

		 System.out.println(x);
                  
	         return 10;
	 }

}

class constrDemo{

	public static void main(String[] args){

                System.out.println("start main");
     
		Demo obj = new Demo();
              
		System.out.println("End main");
     }
}
