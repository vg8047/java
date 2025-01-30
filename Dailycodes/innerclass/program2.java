class Parent{

	{

		System.out.println("hello");

	}

        Parent(){

		System.out.println("parent constructor");

       }

	void fun(){

		System.out.println("in parent fun");

	}

}
class child extends Parent{

	child(){

		super();
	}

	void fun(){

		System.out.println("in child fun");

		super.fun();

	}

	public static void main(String[ ] args){

		 child obj = new child();
      
		 obj.fun();
		 

	}
}
