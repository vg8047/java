class Demo extends Thread{

	public void run(){

		System.out.println("in run");

	        System.out.println(Thread.currentThread());

		System.out.println(getName());

	}



        public static void main(String[] args){
     
		Demo obj = new Demo();

		obj.setPriority(10);

		obj.start();

		System.out.println(Thread.currentThread());

	        System.out.println(obj.getPriority());

	}
}

