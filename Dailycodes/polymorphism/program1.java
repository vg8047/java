class Overload{

	void fun(int x){

		System.out.println("in int fun");

	}

	void fun(char y){

		System.out.println("in char fun");

	}

	void fun(float z){

		System.out.println("in float fun");

	}

	public static void main(String[] args){

		Overload obj = new Overload();

		obj.fun(10);
		obj.fun('d');
		obj.fun(22.7f);

	}
}
