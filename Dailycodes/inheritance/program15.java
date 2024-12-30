class Demo{

	Demo(){

		int x = 10;

		System.out.println("in parent");

	}


}

class child extends Demo{


	child(){


                super();

		System.out.println("in child");

	}


	public static void main(String[] args){
 
		child obj = new child();

	}
}

