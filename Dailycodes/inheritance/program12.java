class Parent{

        int x = 10;

	int y = 20;


      

	Parent(){

		 System.out.println("in parent");
                 



	 }

}
class child extends Parent{
      

	 child(){

		 System.out.println("in child");

		 System.out.println(x);

		 System.out.println(y);

		 
	 }

}

class Client{

	public static void main(String[] args){

	       child obj = new child();

	       Demo obj2 = new Demo();

	       System.out.println(obj2.x);

	
	}
}
