class ThreadDemo extends Thread{

	public void run(){

		System.out.println(Thread.currentThread().getPriority());

		System.out.println(getPriority());

	}

	public static void main(String[] args){

		System.out.println(Thread.currentThread().getPriority());

		ThreadDemo obj  = new ThreadDemo();

		System.out.println(obj.getPriority());

		obj.setPriority(3);     

		//obj.setPriority(12);   priority ranges between the 1 to 10 an 1 is minimum and 10 is maximum and 5 is default if you set greater than 10 it will give error
		
		obj.start();

		//obj.start();            once you start any thread you can start it another time it will give you error

		

	}
}

		
