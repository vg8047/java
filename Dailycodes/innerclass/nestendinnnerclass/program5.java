class Outer{

	Outer(){

		System.out.println("in outer constructor");

	}

	void fun(){

		 System.out.println("in outer fun");

	}

	class Inner1{

		Inner1(){

			System.out.println("in Inner1 constructor");

		}

		void fun(){

			System.out.println("in inner1 fun");
		}

		class Inner2{

			 Inner2(){

				 System.out.println("in inner2 constructor");

			 }
		}

	}

}

class Main{

		public static void main(String[] args){

			Outer obj = new Outer();

			Outer.Inner1 obj1 =obj.new Inner1();

			Outer.Inner1.Inner2 obj2 = obj1.new Inner2();

	}

}
	
	
