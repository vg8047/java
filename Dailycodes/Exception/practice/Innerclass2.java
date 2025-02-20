class Demo{

	void fun(){
		
		System.out.println("in fun");


	}

	 static class Client{

		   void gun(){

		      
			   System.out.println("in gun inner");
                          
		   }

		  

	  }

}

class Parent{

	  public static void main(String[] args){

		 Demo.Client cl =new Demo.Client();

		  cl.gun();
		 

	  }
}
