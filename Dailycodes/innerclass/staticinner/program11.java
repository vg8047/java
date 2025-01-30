class Demo{

	void fun(){

		System.out.println("in fun");

	}

}
class Demochild{

	 public static void main(String[] args){


		  new Demochild(){

			 void fun(){

				 System.out.println("Demochid$1 fun");

			 }
		 }.fun();

		
	 }
}
