class Demo{

}

class  Demochild extends Demo{

}

class Client{

	void fun(Demo obj){

		System.out.println("in fun ");

	}
}

class Outer{

	 public static void main(String[] args){

		 Client obj = new Client();

		 obj.fun(new Demochild());
		 obj.fun(new Demo());

	 }
}
