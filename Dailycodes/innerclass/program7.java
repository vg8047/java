class Outer{

	class Inner{

		Inner(){

		}

	}

}
class Demo{

	public static void main(String[] args){

		Outer.Inner obj = new Outer().new Inner();

	}
}
