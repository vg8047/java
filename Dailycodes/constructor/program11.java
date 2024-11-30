class Demo{

	 Demo(int x){
          
		 System.out.println("in constructor");

		 System.out.println(x);

	}

}

class constrDemo{

	public static void main(String[] args){

                System.out.println("start main");
     
		Demo obj = new Demo('a');
              
		System.out.println("End main");
     }
}
