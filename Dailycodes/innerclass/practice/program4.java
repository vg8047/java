class Outer{

	void fun(){

		System.out.println("in outer fun");

	}

       class Inner{

	       Inner(){

		       System.out.println("in inner constructor");

	       }

	       void fun(){

		       System.out.println("in inner fun");

	       }
       }

}

class Main{


	public static void main(String[] args){

                Outer. Inner obj = new Outer().new Inner();
		 

	}
}

                  		 
