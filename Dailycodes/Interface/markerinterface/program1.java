class Parent{

	static void fun(){

		System.out.println("in parent fun");

	}


}

class child extends Parent{

	void fun(){

		System.out.println("fun-child");

	}

}

class Client{

	public static void main(String[] args){

		Parent obj = new child();

		obj.fun();

	}
}
