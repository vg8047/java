class Demo{

	Demo fun(){

		System.out.println("in fun");

		return new Demo();


	}

	public static void main(String[] args){

		Demo obj = new Demo();

		System.out.println(obj.fun());

	}
}
