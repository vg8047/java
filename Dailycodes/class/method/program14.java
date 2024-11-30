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

	public void run(int i,float j){

		System.out.println("in run");

		System.out.println(i);

		System.out.println(j);

	}

	public static void main(String[] args){

		xyz obj1 = new xyz();

		Demo obj2 = new Demo();

		obj2.gun(20);

		obj2.run(20,12.3f);

		obj1.fun(21);
	}
}
