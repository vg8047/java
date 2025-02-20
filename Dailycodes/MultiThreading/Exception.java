class ThreadDemo extends Thread{


	public void run(){

		System.out.println(10/0);

	}
   

	public static void main(String[] args){

		ThreadDemo obj  = new ThreadDemo();

		obj.start();

		System.out.println(10/0);

	}
}
