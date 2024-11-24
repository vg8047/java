class JvmInternal{

	public static void main(String[] args){

	       
		char ch = 'A';

		char ch2 = 'B';

		char ch3 = 'a';

		int num1 = 65;

		int num2 =66;

		int num3 = 97;

		System.out.println(System.identityHashCode(ch));

		System.out.println(System.identityHashCode(ch2));

		System.out.println(System.identityHashCode(ch3));

		System.out.println(System.identityHashCode(num1));

		System.out.println(System.identityHashCode(num2));

		System.out.println(System.identityHashCode(num3));

	}

}
