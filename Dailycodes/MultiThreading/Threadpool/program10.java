import java.util.concurrent.*;

class UserThread extends Thread{

	public void run(){

		System.out.println(getName());

	}

	public static void main(String[] args){

		ExecutorService es = Executors.newCachedThreadPool();

		for(int i=0;i<9;i++){

			UserThread obj =new UserThread();

			es.execute(obj);

		}

	}
}
