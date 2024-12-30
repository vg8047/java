class Demo{


}
class Demochild extends Demo{

}

class Parent{

	Object fun(){

		return new Object();

	}

}

class child extends Parent{

	Demochild fun(){
		

		return new Demochild();

	}

}
class Client{

	public static void main(String[] args){

	}
}
