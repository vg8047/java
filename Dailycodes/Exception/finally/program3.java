class Demo{

	public static void main(String[] args){

	     try{
		
		     System.out.println(10/0);
	     
	     }catch(NullPointerException ae){
		      
		     System.out.println("divide by zero");

	     }

	     finally{
		      System.out.println("before Exception");
	     }

	}
}
