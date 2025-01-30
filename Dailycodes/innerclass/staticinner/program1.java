class Outer{

	static int x = 10;

	static void run(){

		System.out.println("in run");

	}

	class Inner{

		int y = 20;

		void fun(){

			System.out.println("in fun");

			System.out.println(x);

			run();

		}
	}

	public static void main(String[] args){

		Outer obj = new Outer();

		Inner obj1 = obj.new Inner();
              
		System.out.println(obj1.y);

                obj1.fun();

		

       }
}

