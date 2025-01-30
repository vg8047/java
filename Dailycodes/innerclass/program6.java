class Outer{

	int x = 10;

	Outer(){

		System.out.println("in Outer");

	}

	void fun(){

		System.out.println("in outer fun");

	}

	class Inner{

		Inner(){

			System.out.println("in inner");

		}

		void fun(){

			System.out.println("in inner fun");

		}

	}

	public static void main(String[] args){

		Outer obj = new Outer();

		Inner innobj= obj.new Inner();

		System.out.println(obj.x);

		obj.fun();

		Inner inobj1 = new Outer().new Inner();

	}
}
