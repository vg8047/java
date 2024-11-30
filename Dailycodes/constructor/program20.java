class Demo{


	int x = 10;

	static int y = 20;

	void fun(){

		System.out.println("in fun");

	}

	static void run(){

		System.out.println("in run");
	}

	public static void main(String[] args){

		Demo obj = new Demo();

		System.out.println(y);

		run();

	}
}
