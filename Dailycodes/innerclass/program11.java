class Outer{

	int x = 10;

	static int y = 20;

	Outer(){

		System.out.println("in outer");

	}

	class Inner{

		int x = 30;

		Inner(int x){

			super();

			System.out.println("innner constructor");

		        System.out.println(this.x);

			System.out.println(y);

			System.out.println(x);

			System.out.println(Outer.this.x);

			System.out.println(this);

			System.out.println(Outer.this);

             

		}

		Inner(){

			System.out.println("hello hi");

		}
	}

	public static void main(String[] args){

		Outer obj = new Outer();

		Inner inobj = obj.new Inner(110);

	}
}
