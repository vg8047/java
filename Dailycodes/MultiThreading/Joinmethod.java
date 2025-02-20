class Demo extends Thread{

	public void run(){

              for(int i=0;i<10;i++){

		      System.out.println("in run");
                       
		      try{

			      Thread.sleep(2000);
		      
		      }catch(InterruptedException ie){

		      }
	      }

	}

}

class ThreadDemo {

	public static void main(String[] args)throws InterruptedException{

		Demo obj = new Demo();

		obj.start();

		obj.join();

		for(int i=0;i<10;i++){

			System.out.println("in main");

		}
	}

}
