class Demo{


	int x = 10;

	static int y = 20;

	void fun(){

		System.out.println("in fun");

	}

	static void run(){

		System.out.println("in run");
	}

}

class constrDemo{

	public static void main(String[] args){

		Demo obj = new Demo();

		System.out.println(obj.x);

		System.out.println(obj.y);

		obj.fun();

		obj.run();

	}
}
