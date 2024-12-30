class Demo{

      
	static void run(){

		System.out.println("in run");
        }
 
       static void gun(){

	    run();   
            System.out.println("in gun");

       }

       Demo(){
	     

	       System.out.println("in demo constructor");
	       

       }

       void fun(){

	      gun();

	       System.out.println("in fun");

	      }

}

class child extends Demo{

	     child(){

		 super.fun();

		 System.out.println("in child");

	     }

	     public static void main(String[] args){

		     child obj = new child();

	     }

}
