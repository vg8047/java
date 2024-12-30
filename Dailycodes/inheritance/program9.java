class Parent{

        int x = 10;

	int y = 20;


	void fun(){

		System.out.println("in fun");

	}

	Parent(){

		 System.out.println("in parent");

	 }

}
class child extends Parent{
      

	int x = 30;

	int y = 40;

	void fun(){

		System.out.println("in child fun");

	}

	 child(){

		 System.out.println("in child");
	 }

}

class Client{

	public static void main(String[] args){

		Parent obj = new child();

		System.out.println(obj.x);

		System.out.println(obj.y);
                 
		obj.fun();
	}
}
