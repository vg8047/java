class MyException extends Exception{

	MyException(String str){

		super(str);

	}
}

class Demo{
	 
	public static void main(String[] args){

		 try{

			 throw new MyException("Swatache exception");

		 }catch(MyException ioe){

			  ioe.printStackTrace();

		 }

	}
}
