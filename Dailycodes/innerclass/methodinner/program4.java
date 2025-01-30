class Outer{

	void fun(){

		 class  Innerclass{


			 Innerclass(){

				 System.out.println("in inner constructor");
				 
				

			 }


			 class Inner2class{

				 Inner2class(){

					 System.out.println("in inner2class ");

				 }
			 }

			 Inner2class obj = new Inner2class();

		 }

		   Innerclass obj = new Innerclass();

		   System.out.println("in fun");

	}

}

class Main{

	public static void main(String[] args){

		Outer obj = new Outer();

		obj.fun();

	}
}
