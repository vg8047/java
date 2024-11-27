class One{

	int x = 10;

	static int y = 20;

	void gun(){

		System.out.println("in gun");
	}


	static void fun(){

		System.out.println("in fun");
	}
}

class Two{

    public static void main(String[] args){

	  System.out.println("in main method ");

	  System.out.println(x);

	  System.out.println(y);

	  fun();

	  gun();

    }

}
