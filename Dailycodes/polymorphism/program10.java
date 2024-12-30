class Demo{

	static int x = 10;

	Demo(){

	System.out.println("in constructor");

	}


	static {

		run();

		System.out.println("static block");

	        System.out.println(x);
	        

	}

	static void run(){

		System.out.println("in static method");

	}

	public static void main(String[] args){

		System.out.println("in main method");

		run();

	}
}
