class Demo{

	public static void main(String[] args){

		String str1 = "vighnesh";

		System.out.println(System.identityHashCode(str1));

		String str2 = "om";

		System.out.println(System.identityHashCode(str2));

		String str3 = "vikas";

		System.out.println(System.identityHashCode(str3));

		String str4 = "vighneshom";

		System.out.println(System.identityHashCode(str4));

		String str5 = str1 + str2; // if any operation is performed then it is stored in heap two string + call internally append function of stringbuilder

		System.out.println(System.identityHashCode(str5));



	}
}
