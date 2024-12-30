class Parent{

	 Parent(){

		 System.out.println("in parent");

	 }

}
class child extends Parent{

	 child(){

		 System.out.println("in child");
	 }

}

class Client{

	public static void main(String[] args){

		child obj = new child();

	}
}
