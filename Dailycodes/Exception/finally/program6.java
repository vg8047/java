class Demo{

	     Demo()throws InterruptedException{

		System.out.println("start constructor");

		Thread.sleep(5000);

		System.out.println("End constructor");

	}

	public static void main(String[] args)throws InterruptedException{

		 Demo obj = new Demo();


	}
}

