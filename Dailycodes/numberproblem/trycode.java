class Demo{

       static int x = 10;

	static void fun(){
        
		System.out.println("in fun");
	    

	}

	void run(){

		fun();

		System.out.println(x);

	}

   public static void main(String[] args){

	   

	   Demo obj = new Demo();
	  obj.run();
   }
}
