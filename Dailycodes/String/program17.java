class Demo{

	public static void main(String[] args){

		String str1 = new String("vighnesh");

		System.out.println(str1);

		System.out.println(System.identityHashCode(str1));

		str1 = str1 + "Belkar";

		System.out.println(str1);
		
		System.out.println(System.identityHashCode(str1));

		str1 = str1 + "Sinhgad";

		System.out.println(str1);

		System.out.println(System.identityHashCode(str1));
               
	}
}
