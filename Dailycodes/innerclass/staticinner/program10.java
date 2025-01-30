class Demo{

	void fun(){

		System.out.println("in demo fun");

	}

}
class Demochild extends Demo{


	void fun(){

		System.out.println("in demochild fun");

	}

	public static void main(String[] args){

                 
		Demo obj = new Demochild(){

			void fun(){

				System.out.println("in fun - Demochild$1");

			}
		};

		obj.fun();

	}
}
