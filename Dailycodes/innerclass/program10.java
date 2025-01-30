class Outer{

	int x = 10;

	static int y = 20;

	Outer(){

		System.out.println("in outer");

	}

	class Inner{

		int x = 30;

		Inner(int x){

			System.out.println("innner constructor");

		        System.out.println(this.x);

			System.out.println(y);

			System.out.println(x);

		}
	}

	public static void main(String[] args){

		//Outer obj = new Outer();

		Inner inobj = new Outer().new Inner(110);

	}
}
