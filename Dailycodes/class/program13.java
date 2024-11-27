class Demo{

	static void fun(){

		System.out.println("in fun");

	}

	public static void main(String[] args){

              Demo obj = new Demo();

	      fun();

	      obj.fun();

	      Demo.fun();

	}
}
