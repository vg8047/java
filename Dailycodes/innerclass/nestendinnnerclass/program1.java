class Outer{

	class Inner1{

		Inner1(){

			System.out.println("constructor inner1");

		}

		class Inner2{

			Inner2(){

				System.out.println("constructor inner2");

			}
		}
	}

	public static void main(String[] args){

		Outer obj = new Outer();

		Inner1 in1obj = obj.new Inner1();

		Inner1.Inner2 in2obj = in1obj.new Inner2();

	}
}
