class Outer{


	int x = 10;

	static int y = 20;

	Outer(){

		System.out.println("in outer ");

	}

	class Inner{

	        int x = 90;

		Inner(){

			System.out.println("innner ");

	         	System.out.println(x);

		        System.out.println(y);
 
		}

	}

	public static void main(String[] args){

		Outer obj = new Outer();

		Inner obj1 = obj.new Inner();

	}
}
