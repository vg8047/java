class Overload{

	void fun(int x,int y){

		System.out.println("in int-int fun");

	}

	void fun(int x,float y){

		System.out.println("in int-float fun");

	}

	void fun(float x,float y){

		System.out.println("in float-float fun");

	}

	public static void main(String[] args){

		Overload obj = new Overload();

		obj.fun(10,12);

	}
}
