class ThreadDemo extends Thread{

	public void run(){

		for(int i=0;i<10;i++){

			System.out.println("in ThreadDemo");

		}
	}
}



class Mythread extends Thread{

              public void run(){

		      for(int i=0;i<10;i++){
    
			       System.out.println("in mythread");
		      }

	      }

}

class Client{

	public static void main(String[] args){

		Mythread obj = new Mythread();

		ThreadDemo obj1 = new ThreadDemo();


                obj1.start();
		obj.start();

		for(int i=0;i<10;i++){

			 System.out.println("main");

		}

	}
}
