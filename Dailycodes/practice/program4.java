class Groupexample extends Thread{

	Groupexample(ThreadGroup t1,String str){

		 super(t1,str);

	}

	public void run(){

		System.out.println(Thread.currentThread());

	}

	public static void main(String[] args){

		 ThreadGroup tg1 = new ThreadGroup("sits");

                 ThreadGroup subg1 = new ThreadGroup(tg1,"scoe");

		 ThreadGroup subg2 = new ThreadGroup(tg1,"skn");

		 Groupexample t1 = new Groupexample(subg1,"vighnesh");

		 Groupexample t2 = new Groupexample(subg1,"om");

                 Groupexample t3 = new Groupexample(subg2,"vikas");
                 
                 Groupexample t4 = new Groupexample(subg2,"godbole");


		 t1.start();
		 t2.start();
		 t3.start();
		 t4.start();

		 System.out.println(subg1.activeCount());
                 
           }
}
