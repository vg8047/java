class Demo{

	public static void main(String[] args){

		String str1 = "vighnesh";

		String str2 = "vighnesh";

		System.out.println(str1.equals(str2)); // this method compares the content 

		System.out.println(str1 == str2); // this compares the address

		String str3 = "om";

		String str4 = new String("om");

		System.out.println(str3.equals(str4));
                
                System.out.println(str3 == str4);

	}
}

