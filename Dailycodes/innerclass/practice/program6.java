class Outer{


     static void gun(){

		System.out.println("in outer gun");

	}

	static class Inner{

		Inner(){

	             gun();
		}

	}




	public static void main(String[] args){

                    Inner obj = new Inner();

	}
}
