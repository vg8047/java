class Parent {

	void marry(){

		System.out.println("alia");

	}
}

class Demo{

	void fun(Parent obj){

		obj.marry();

	}

	void fun(child obj){

		obj.marry();

	}
}
class Outer{

	public static void main(String[] args){

		Demo obj = new Demo();

		obj.fun(new Parent(){

			void marry(){

				System.out.println("deepika");

			}
		});

	}
}
