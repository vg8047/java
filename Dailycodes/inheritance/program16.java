class Demo{

	static int y=10;

	Demo(){

		int x = 20;

		System.out.println("in parent demo");

	}


}

class child {


	public static void main(String[] args){

             Demo obj = new Demo();

	     System.out.println(Demo.y);
	     
          

	}

}


