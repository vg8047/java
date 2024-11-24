class Demo{

	public static void main(String[] args){

		String name = "vighnesh";

		System.out.println(System.identityHashCode(name));

		String name2 = new String("vighensh");

		System.out.println(System.identityHashCode(name2));

	}

}
