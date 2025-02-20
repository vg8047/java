class Mythread extends Thread{

	 public void run(){

		  System.out.println(Thread.currentThread().getName());

	 }
}

class Client{

	public static void main(String[] args){

		 Mythread obj = new Mythread();
		 
		 obj.setName("vighnesh");

		 obj.start();

	}
}
