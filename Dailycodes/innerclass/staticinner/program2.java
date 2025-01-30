class Outer{

         static int x = 10;

	 int y = 20;

	 static void fun(){

		 System.out.println("in fun");
	 }

	 void run(){

		 System.out.println("in run");

	 }

	 static class Inner{

		  Inner(){

			  System.out.println(x);

			  fun();

			  

		  }

	 }

	 public static void main(String[] args){

		 Inner obj = new Inner();

	 }
}
