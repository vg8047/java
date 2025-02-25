class DemoThread implements Runnable{

	public void run(){

		System.out.println("in run");

		System.out.println(Thread.currentThread());

	}

	public static void main(String[] args){

		DemoThread obj = new DemoThread();

		Thread obj1 = new Thread(obj,"vighnesh");

		obj1.setPriority(10);

		obj1.start();

		System.out.println(Thread.currentThread());

	}
}
