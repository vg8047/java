interface Demo{

	void m1();
	

}

class Outer{

	public static void main(String[] args){

		Demo obj =()->{

			System.out.println("IN m1 outer$1");

		};

		obj.m1();


	}
}
