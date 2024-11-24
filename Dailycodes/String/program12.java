class Demo{

	public static void main(String[] args){

		String str1 = "vighnesh";

		System.out.println(System.identityHashCode(str1));

		String str2 = "om";

		System.out.println(System.identityHashCode(str2));

		String str3 = "vighnesh belkar";

		System.out.println(System.identityHashCode(str3));

	}
}
