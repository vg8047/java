class Demo{

	Demo(int x){

		System.out.println("in constructor");

		System.out.println(x);

		System.out.println(this);

	}

	public static void main(String[] args){

		Demo obj = new Demo(10);

		System.out.println(obj);

	}
}
