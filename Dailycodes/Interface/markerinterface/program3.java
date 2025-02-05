class Parent{

	static  void fun(){

		System.out.println("in parent fun");

	}


}

class child extends Parent{

	static void fun(){

		System.out.println("fun-child");

	}

}

class Client{

	public static void main(String[] args){

	       Parent obj2 = new Parent();

	       obj2.fun();

	       child obj3 = new child();
	       obj3.fun();
	
		Parent obj = new child();

		obj.fun();

	}
}
