class parent{

	int x = 10;

	void fun(){

		System.out.println("in fun");

	}

}

class child extends parent{



}

class Client{


	public static void main(String[] args){

		parent obj = new parent();

		System.out.println(obj.x);

		obj.fun();

	}
}
