class Demo{

	void fun(){
		
		System.out.println("in fun");


	}

	  class Client{

		   void gun(){

		      
			   System.out.println("in gun inner");
                           fun();
		   }

		  

	  }

	  public static void main(String[] args){

		  Client cl = new Demo(). new Client();

		  cl.gun();
		 

	  }
}
