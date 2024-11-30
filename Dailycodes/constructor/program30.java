class Demo{

	int x = 10;

	Demo(int x){

		System.out.println("in constructor");

		System.out.println(x);

		System.out.println(this.x);

	}

	void fun(){

		System.out.println(x);

	}

	public static void main(String[] args){

		Demo obj1 = new Demo(20);

		Demo obj2 = new Demo(30);

		System.out.println(obj1.x);	//10

		System.out.println(obj2.x);  //10

		obj1.fun();

		obj2.fun();
		
		obj1.x=50;

		obj1.fun();

		obj2.fun();

	}
}
