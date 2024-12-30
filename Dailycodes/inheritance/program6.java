class parent{

      private parent(){

		System.out.println("in parent constructor");

	}

}

class child {

      public static void main(String[] args){

	parent obj = new parent();

      }

}
