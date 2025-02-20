import java.io.*;
class Demo extends Exception{

	 Demo(String str){

		 super(str);

	 }
}

class RuntimeException{

	public static void main(String[] args){
                
		try{
                     
			 System.out.println("hi");

		}finally{

		     System.out.println("hello");

	     }
                   

	}
}
