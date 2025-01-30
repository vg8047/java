class Outer{

	class Inner1{

		void run(){

			System.out.println("in run");

		}

	}

	void fun(){

		System.out.println("in fun");

	}

	public static void main(String[] args){

		Outer obj = new Outer();

		obj.fun();

		Inner1 inobj = obj.new Inner1();

		inobj.run();

	}
}
