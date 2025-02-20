class ThreadDemo extends Thread{

	static Thread mainThread = null;

         public void run(){

		 System.out.println("in run");

	         System.out.println(mainThread.getName());
            
		 System.out.println(getName());
	 }

       public static void main(String[] args)throws InterruptedException{

	        mainThread = Thread.currentThread();

		System.out.println(mainThread);

		ThreadDemo obj =  new ThreadDemo();

		obj.start();

	 }
}
