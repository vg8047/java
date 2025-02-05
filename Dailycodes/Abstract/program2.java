abstract class Parent {

	void career(){

		System.out.println("software engineer");

	}

	public abstract  void marry();

}

class child extends Parent{

       public void marry(){

		System.out.println("disha patani");

	}

}

class Client {

	public static void main(String[] args){

		Parent obj = new child();

		obj.marry();

	}
}

