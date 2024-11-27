class One{


	int x = 10;

	private int y =20;

	void fun(){

		System.out.println("in fun");

	}

	private void run(){

		System.out.println("in run");

	}

}

class Two{

	public static void main(String[] args){

		One obj = new One();

		System.out.println(obj.x);

		System.out.println(obj.y);

		obj.fun();

		obj.run();

	}
}
