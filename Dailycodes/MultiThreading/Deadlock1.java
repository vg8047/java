class Demo extends Thread{

	public void run(){

              for(int i=0;i<10;i++){

		      System.out.println("in run");
                       
		     try{
			     join();

		     }catch(InterruptedException ie){

		     }
	      }

	}

}

class ThreadDemo {

	public static void main(String[] args)throws InterruptedException{

		Demo obj = new Demo();

		obj.start();

		for(int i=0;i<10;i++){

			System.out.println("in main");
                         
			
		}
	}

}
