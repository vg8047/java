class ThreadSleep extends Thread{

	public void run(){

		 for(int i=0;i<10;i++){

			 System.out.println("in run");

			 try{
			      Thread.sleep(2000);
                           
			 }catch(InterruptedException ie){

				 System.out.println("in sleep");

			 }
		 } 
	}

	public static void main(String[] args)throws InterruptedException{

		ThreadSleep obj = new ThreadSleep();

		obj.start();

		for(int i=0;i<10;i++){

			System.out.println("in main");

			Thread.sleep(2000);

		}

	}
}
