class xyz{

	public void fun(){

		System.out.println("in fun");

	}

}

class Demo{

	public void gun(){

		System.out.println("in gun");

	}

	public static void main(String[] args){

		xyz obj1 = new xyz();

		Demo obj2 = new Demo();

		obj2.gun();

		obj1.fun();
	}
}
