class Demo extends RuntimeException{


}

class Client{

	public static void main(String[] args){

		throw new Demo();

	}
}
