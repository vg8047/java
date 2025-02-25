import java.util.concurrent.*;

class  Threadtask extends Thread{

	int num = 0;

	Threadtask(int num){

		this.num = num;

	}

	public void run(){

		System.out.println(Thread.currentThread().getName()+"start-"+num);

		fun();

		System.out.println(Thread.currentThread().getName()+"end-"+num);


	}

	void fun(){

		try{

			Thread.sleep(2000);

		}catch(InterruptedException ie){

		}


	}
}

class ThreadpoolDemo{

	public static void main(String[] args){

		 ExecutorService threadpool = Executors.newFixedThreadPool(5);

		 for(int i=0;i<=10;i++){

			  Threadtask task = new Threadtask(i);

			  threadpool.execute(task);                 

		 }

		 threadpool.shutdown();
	}
}
