class MyException extends Exception{

	MyException(String str){

		super(str);

	}
}

class Demo{
	 
	public static void main(String[] args){

		 try{
                         System.out.println(10/0);
			 throw new MyException("Swatache exception");

		 }catch(MyException ioe){

			  ioe.printStackTrace();

		 }catch(ArithmeticException ae){

			 ae.printStackTrace();

		 }

	}
}
