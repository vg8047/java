class parent {

	Object fun(){


		return new Object();

	}

}

class child extends parent{

	String fun(){

		return "vighnesh";

	}
}

class Client{

	public static void main(String[] args){

		parent p = new child();

		p.fun();

	}
}

