class Demo{

	 Demo(int x){
          
		 System.out.println("in constructor");

	}

}

class constrDemo{

	public static void main(String[] args){

                System.out.println("start main");
     
		Demo obj = new Demo(10);
              
		System.out.println("End main");
     }
}