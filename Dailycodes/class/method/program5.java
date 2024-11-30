class Demo{

	float fun(){

		int x = 10;

		System.out.println("in fun");

		return x;
	}

	public static void main(String[] args){
     
		Demo obj = new Demo();

		System.out.println(obj.fun());

		float y = obj.fun();

		System.out.println(y);

	}
}

