interface MacD{

	static public void burger(){

		System.out.println("Making Burger");

	}

	default public void fries(){

		System.out.println("Making fries");

	}

	void revenue();

}

class sinhgadmacd implements MacD{

	public void revenue(){

		System.out.println("1.5 cr");

	}

	public void burger (){

		System.out.println("making burger");

	}

}

class Dhayrimacd implements MacD{

	public void revenue(){

		System.out.println("2 cr");

	}
}
