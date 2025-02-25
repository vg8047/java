import java.util.concurrent.*;

class ThreadDemo extends Thread{


	public void run(){

		System.out.println(getName());

	}

	public static void main(String[] args){

		ExecutorService es = Executors.newFixedThreadPool(10);

		for(int i=0;i<10;i++){

			ThreadDemo obj = new ThreadDemo();
			es.execute(obj);

		}

		es.shutdown();

	}
}





	
