class Outer{


     static void gun(){

		System.out.println("in outer gun");

	}

	static class Inner{

		Inner(){

	             gun();
		}

	}


}

class Main{

	public static void main(String[] args){

                    Outer.Inner obj = new Outer.Inner();

	}
}
