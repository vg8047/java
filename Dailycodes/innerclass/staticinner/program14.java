class Parent{

}

class child extends Parent{

}

class Demo{

	void fun(Parent obj){

		System.out.println("in fun - parent");

	}
	
	void fun(child obj){

		System.out.println("in fun - child");
	}


}

class Outer{

	public static void main(String[] args){

		Demo obj = new Demo();

		obj.fun(new Parent());

		obj.fun(new child());

	}
}
