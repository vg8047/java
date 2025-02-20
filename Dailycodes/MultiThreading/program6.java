class ThreadDemo extends Thread{

	     public void run(){

		     for(int i=0;i<5;i++){

			      System.out.println(Thread.currentThread().getName());

		     }
	     }
}

class Client{

	public static void main(String[] args){

		ThreadDemo obj1 = new ThreadDemo();

		obj1.start();

		 ThreadDemo obj2 = new ThreadDemo();

                obj2.start();

	        ThreadDemo obj3 = new ThreadDemo();
                
                obj3.start();

	}
}
