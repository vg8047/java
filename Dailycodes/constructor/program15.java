class Demo{

	int x = 10;

	int y = 20;

	 Demo(int a , int b){
          
		 System.out.println("in constructor");

		 System.out.println(x);
                  
	         System.out.println(y);

		 x = a;

		 y = b;

	 }

	 void printdata(){

		 System.out.println(x);

		 System.out.println(y);
	 }

}

class constrDemo{

	public static void main(String[] args){

                System.out.println("start main");
     
		Demo obj = new Demo(30,40);

		obj.printdata();
              
		System.out.println("End main");
     }
}
