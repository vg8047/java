class Parent{

   	String study(){

		System.out.println("in parent");

		return "v";

	}
       
	
}
class child extends Parent{

	String study(int x){

		System.out.println("in child");

		return "vg";

	}

}
class Client{

	public static void main(String[] args){

		Parent p = new child();

		p.study(20);
		

	}
}
