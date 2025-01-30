class Outer{

	void fun(){

		System.out.println("in fun");

	    class Inner1{

		    Inner1(){

			    System.out.println("constructor Inner1");

		    }

		    void run(){

			    class Inner2{

			    }
			    class Inner3{

			    }

			    Inner2 obj = new Inner2();

		    }
	    }

	    class Inner4{
	    
	    }

	    Inner1 obj = new Inner1();
	    obj.run();

	}

	public static void main(String[] args){

		Outer obj = new Outer();

		obj.fun();

	}
}
