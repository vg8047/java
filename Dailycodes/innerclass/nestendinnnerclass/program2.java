class Outer{

	Outer(){

		System.out.println("outer constructor");

	}

	class Inner1{

		Inner1(){

			System.out.println("inner1 constructor");

		}

		class Inner2{

			Inner2(){

				System.out.println("inner2 constructor");

			}

		}

	}

	public static void main(String[] args){

		Outer obj = new Outer();

		Inner1 inobj = obj.new Inner1();

		Inner1.Inner2 inobj2 = inobj.new Inner2();

		Inner1.Inner2 inobj3 = new Outer().new Inner1().new Inner2();

	}
}
