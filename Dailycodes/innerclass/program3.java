class Outer{

	void fun(){

		System.out.println("In fun");

	}

	class Inner{

		Inner(){

		}

	}

	void gun(){

		System.out.println("in gun");

	}

	public static void main(String[] args){

		Outer obj = new Outer();

                obj.fun();

		obj.gun();

	}
}
