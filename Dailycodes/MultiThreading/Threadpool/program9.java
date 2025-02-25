import java.util.concurrent.*;

class UserThread implements Runnable{

	public void run(){

		System.out.println(Thread.currentThread().getName());

	}

	public static void main(String[] args){

		ExecutorService es = Executors.newSingleThreadExecutor();

		for(int i=0;i<9;i++){

			UserThread obj = new UserThread();

			Thread t = new Thread(obj);

			es.execute(t);

		}

		es.shutdown();

	}
}

		
