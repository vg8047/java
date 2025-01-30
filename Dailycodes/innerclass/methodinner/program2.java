class Outer{

	void fun(){

		 System.out.println("in fun");

		 class Inner1{

			 Inner1(){

				 System.out.println("inner1 class");
				 gun();

			 }

			 void gun(){

				 System.out.println("in gun");

				 class Inner2{

					 Inner2(){

						 System.out.println("inner2 class");

					 }
				 }


				 Inner2 obj = new Inner2();
			 }
		 }

		 Inner1 obj = new Inner1();

	}




	public static void main(String[] args){

		Outer obj = new Outer();

		obj.fun();

	}
}
