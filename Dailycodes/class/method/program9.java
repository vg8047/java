class xyz{

	static void fun(){

		System.out.println("in fun");

	}

}

class Demo{

	static void run(){

		System.out.println("in run");

	}

	public static void main(String[] args){

		run();

		xyz.fun();

	}
}
