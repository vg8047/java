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

		         System.out.println(e.getMessage());

		 }
	 }
 
	public static void main(String[] args){

                      fun();

                }
}	
