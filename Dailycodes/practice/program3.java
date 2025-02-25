class Demo {

	  public void run(){

		

	  }

	  public void finalize(){

		  System.out.println("in garbage collector");


	  }

	  public static void main(String[] args)throws InterruptedException{

		  Demo obj = new Demo();

		  obj = null;

		  System.gc();

		  Thread.sleep(2000);

	  }
}
