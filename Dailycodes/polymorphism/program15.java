class parent{

	int x = 10;

	void  run(){

		System.out.println(x);

		

	}

	 void fun(){

		System.out.println(x);

	}


	public static void main(String[] args){

		parent obj = new parent();

		obj.fun();

	}
}
