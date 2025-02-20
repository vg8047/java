class ThreadDemo extends Thread{

	 public static void main(String[] args){

		 System.out.println(Thread.currentThread().getName());

		 ThreadDemo t1= new ThreadDemo();

		 t1.start();

		 Thread.currentThread().getName();

		 System.out.println(Thread.currentThread().getName());

	 }
}
