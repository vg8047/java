class parent{

	int x =10;

	void fun(){

		System.out.println("in fun");

	}

}

class child extends parent {


	public static void main(String[] args){


		child obj = new child();

		System.out.println(obj.x);

	       obj.fun();

	}
}
