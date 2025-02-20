class ThreadDemo extends Thread{

	static Thread mainThread = null;

         public void run(){

		 for(int i=0;i<5;i++){

			 System.out.println("in run");

			try{
			  mainThread.join();
                         
			}catch(Throwable e){

			}
		 }
	 }

       public static void main(String[] args)throws InterruptedException{

	        mainThread = Thread.currentThread();

		System.out.println(mainThread);

		ThreadDemo obj =  new ThreadDemo();

		obj.start();

		for(int i=0;i<5;i++){

			System.out.println("in main");
			obj.join();

		}


	 }
}
