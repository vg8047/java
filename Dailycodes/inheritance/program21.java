class Demo{

	 Demo(){

		System.out.println("no arguments");

	}

	Demo(int x){

	        System.out.println("para1 constr");

	}

	Demo(char y){

		System.out.println("char para1 constr");

	}

}

class child extends Demo{

	private child(){

	   
	}

	public static void main(String[] args){

                
		child obj = new child();

	}

}



