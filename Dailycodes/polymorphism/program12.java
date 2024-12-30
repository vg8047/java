class Demo{

	static int x =10;

	int y = 20;

	Demo(){

		System.out.println("in constructor");

		System.out.println(y);

	}

	{

		System.out.println("in instance block");

		System.out.println(y);

	}

	void fun(){

		System.out.println("in non static fun");

	}

	public static void main(String[] args){

		Demo obj = new Demo();

		obj.fun();

	}
}
