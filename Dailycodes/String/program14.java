class Demo{

	public static void main(String[] args){


		String str1 = "vihgnesh";

		String str2 = new String("om");

		String str3 = str1;

		String str4 = new String(str2);

		System.out.println(System.identityHashCode(str1)); //100

		System.out.println(System.identityHashCode(str2)); //200
               
		System.out.println(System.identityHashCode(str3)); //200
            
		System.out.println(System.identityHashCode(str4)); //300
      
	}
}
