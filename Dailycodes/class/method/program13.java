class xyz{

	public void fun(int x){

		System.out.println("in fun");

		System.out.println(x);

	}

}

class Demo{

	public void gun(float y){

		System.out.println("in gun");

		System.out.println(y);

	}

	public static void main(String[] args){

		xyz obj1 = new xyz();

		Demo obj2 = new Demo();

		obj2.gun(20);

		obj1.fun(21);
	}
}
