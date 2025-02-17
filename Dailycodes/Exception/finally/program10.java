class Demo extends RuntimeException{


}

class Client{

	static void fun(){

		throw new Demo();

	}

	public static void main(String[] args){

		 fun();

	}
}
