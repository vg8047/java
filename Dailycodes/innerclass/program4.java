class Outer{

	class Inner{

		Inner(){

		     System.out.println("in innner class");

		}
	}

	public static void main(String[] args){


		Inner obj = new Outer().new Inner();

	}
}
