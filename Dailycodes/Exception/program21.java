import java.util.*;

class Demo{

	public static void main(String[] args){

	          System.out.println("Start main");

		  try{
			  System.out.println(10/0);

		  }catch(ArithmeticException ae){

			  System.out.println(ae);

			  System.out.println(ae.getMessage());

			  ae.printStackTrace();

		  }
        }
}
