class Parent{

	int x = 10;

}

class child extends Parent{

	int x = 20;

	public static void main(String[] args){

		Parent p = new child();

		System.out.println(p.x);

	}
}
