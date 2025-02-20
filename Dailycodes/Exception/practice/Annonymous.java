interface Client{

	void fun();
	void gun();

}

class Demo{

	public static void main(String[] args){

	        
	       Client obj = ()->{

	              System.out.println("in fun");

                 };

                obj.fun();	       

	}
}
