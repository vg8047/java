class Demo{


	void run(){

		System.out.println("in run ");

	}

	static void gun(){

		System.out.println("in gun");

	}

	public static void main(String[] args){

               Demo obj = new Demo();

		obj.gun();
		obj.run();

	}
}
