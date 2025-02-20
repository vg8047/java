class ThreadDemo extends Thread{

	public void run(){

		System.out.println(Thread.currentThread().getPriority());

		System.out.println(getPriority());

	}

	public static void main(String[] args){

		ThreadDemo obj  = new ThreadDemo();

		System.out.println(obj.getPriority());
		
		obj.start();

	}
}

		
