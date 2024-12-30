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
      

	

	void fun(){

		System.out.println("in child fun");

	}

	 child(){

		 System.out.println("in child");

		 System.out.println(x);

		 System.out.println(y);
	 }

}

class Client{

	public static void main(String[] args){

	       child obj = new child();

	
	}
}
