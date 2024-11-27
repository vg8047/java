class Demo{

       
	int x = 10;
	
	String str = "vighnesh";

	static int y = 20;



	public static void main(String[] args){


	     int a = 30;

	     int b = 30;

	     String str1 = "vighnesh";

             Demo obj = new Demo();

	     System.out.println(System.identityHashCode(a));

	     System.out.println(System.identityHashCode(b));

	     System.out.println(obj.x);

	     System.out.println(System.identityHashCode(obj.str));

	     System.out.println(y);

	     System.out.println(a);

	     System.out.println(b);

	     System.out.println(System.identityHashCode(str1));

	   

	    

	}
}
