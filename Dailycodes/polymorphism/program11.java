class Demo{

	static int x = 10;

	Demo(){

	System.out.println("in constructor");

	}


	static {

	

		System.out.println("static block1");
	        

	}

	static{

		System.out.println("in static 2");
	}

	static {

		System.out.println("in static 3");

	}

	static void run(){

		System.out.println("in static method");

	}

	public static void main(String[] args){

		System.out.println("in main method");

		run();

	}
}
