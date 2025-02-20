class Innercheck{

	void fun(){

		System.out.println("in fun");

		class Demo{

			   void gun(){

				    System.out.println("in gun");

			   }

		}

		Demo obj = new Demo();
		obj.gun();

	}

	public static void main(String[] args){

		Innercheck obj = new Innercheck();

		obj.fun();

	}
}
