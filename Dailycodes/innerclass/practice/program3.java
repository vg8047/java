class Outer{

           void fun(){

		   System.out.println("in outer fun");

	   }

	   void gun(){

		    fun();

	   }

}

class client{

	   public static void main(String[] args){

		   Outer obj = new Outer(){

			   void fun(){

				   System.out.println("in annonymous fun");

			   }
		   };

		   obj.gun();
	   }
}
