class Demo{

	 int fun(int x){

		System.out.println("in fun");

                return 1;        

	 }

	public static void main(String[] args){


		Demo obj = new Demo();

		System.out.println(obj.fun(10));
	}
}
