class Demo{

	public static void main(String[] args){


		String str1 = "vighnesh";

		String str2 = "vighnesh";

		String str3 = new String("vighnesh");

		String str4 = new String("vighnesh");

		System.out.println(System.identityHashCode(str1));

		System.out.println(System.identityHashCode(str2));

		System.out.println(System.identityHashCode(str3));

		System.out.println(System.identityHashCode(str4));

	}
}
