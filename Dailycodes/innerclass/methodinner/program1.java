class Outer{

	void fun(){

		 System.out.println("in fun");

		 class Inner1{

			 Inner1(){

				 System.out.println("inner1 class");

			 }

		 }

		 Inner1 obj = new Inner1();

	}


	public static void main(String[] args){

		Outer obj = new Outer();

		obj.fun();

	}
}
