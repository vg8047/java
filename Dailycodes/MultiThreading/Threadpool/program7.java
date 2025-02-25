import java.util.concurrent.*;

class ThreadDemo implements Runnable{

	 int num = 0;

	 ThreadDemo(int num){

		 this.num = num;

	 }

	 public void run(){

		 System.out.println(Thread.currentThread()+"start-"+num);

	 }

}

class Client{

	public static void main(String[] args){

		ThreadPoolExecutor threadpool = (ThreadPoolExecutor)Executors.newCachedThreadPool();

		for(int i=0;i<=10;i++){

			ThreadDemo obj =new ThreadDemo(i);

			threadpool.execute(obj);

		}

		threadpool.shutdown();

	}
}
