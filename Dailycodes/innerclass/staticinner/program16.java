class Parent{

	void marry(){

		System.out.println("alia");

	}
}
class Demo {

	void fun(Parent obj){

		obj.marry();

	}


}

class Outer{

	public static void main(String[] args){

		Demo obj = new Demo();

		Parent  p = new Parent(){

			void marry(){

				System.out.println("deepika");

			}

		
		};

		obj.fun(p);

	}
}
