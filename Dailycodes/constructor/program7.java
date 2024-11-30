class Demo{

	 Demo(){
          
		 System.out.println("in constructor");

	}

	void fun(){

		System.out.println("in fun");

	}

	public static void main(String[] args){

                System.out.println("start main");
     
		Demo obj = new Demo();
              
		System.out.println("End main");
     }
}
