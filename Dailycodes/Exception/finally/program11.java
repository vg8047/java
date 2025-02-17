class Demo extends RuntimeException{

	Demo(String str){
            
		 super(str);

	}

}

class Client{

	 static void fun(){

		 try{
			 throw new Demo("Hello from vg");

		 }catch(Demo e){

			 e.printStackTrace();

		 }
	 }
 
	public static void main(String[] args){

                      fun();

                }
}	
