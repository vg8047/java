class Outer{

	 static int x = 10;

	 int y = 20;

	 static void run(){

		 System.out.println("in run");

	 }

	 void gun(){

		 System.out.println("in gun");

	 }

	 static class Inner{

		  Inner(){

			  System.out.println(x);

			 // System.out.println(y);

			  run();

			 // gun();

		  }
	 }

}

class Client{

	 public static void main(String[] args){

		 Outer.Inner obj = new Outer.Inner();

	 }
}
