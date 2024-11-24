class Demo{

	public static void main(String[] args){

		String str1 = "vighnesh";

		System.out.println(System.identityHashCode(str1));

		String str2 = "vighnesh belkar";

		System.out.println(System.identityHashCode(str2));

		String str3 = new String("vighnesh");

		System.out.println(System.identityHashCode(str3));

		String str4 = new String("vighnesh");

		System.out.println(System.identityHashCode(str4));

	}
}
