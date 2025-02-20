class Parent {


	void fun()throws InterruptedException{

		 System.out.println("in parent fun");

	}

}

class child extends Parent {

	 void fun()throws InterruptedException{


		 System.out.println("in child fun");

	 }

	 public static void main(String[] args)throws InterruptedException{


		 Parent obj = new child();

		 obj.fun();

	 }
}
