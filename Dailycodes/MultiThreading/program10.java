class Mythread extends Thread{

	 Mythread(String str){

		 super(str);

	 }


	 public void run(){

		  System.out.println(getName());

	 }
}

class Client{

	public static void main(String[] args){

		Mythread obj = new Mythread("om");

		//obj.setName("vg");

		obj.start();

		obj.setName("vg");

	}
}
