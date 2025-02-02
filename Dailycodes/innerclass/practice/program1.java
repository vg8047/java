class Outer{

	void fun(){

		System.out.println("in outer fun");

	}

	void run(){

		System.out.println("in outer run");

	}

}

class Client{

	public static void main(String[] args){

		 new Outer(){

			void gun(){

				System.out.println("in annonymous");

			}
		  }.gun();

	}
}
