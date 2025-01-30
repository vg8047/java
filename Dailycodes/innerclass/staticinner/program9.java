class Demo{

	void fun(){

		System.out.println("in fun - Demo");

	}
}

class Outer{

	public static void main(String[] args){

		Demo obj = new Demo(){

			void fun(){

				System.out.println("in fun - Outer$1");

			}
		};

		obj.fun();

	}
}
