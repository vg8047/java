class Demo{

	void fun(String x){
		
		System.out.println("in fun");

	}

}
class Demochild{

	public static void main(String[] args){

		Demo obj = new Demo();

		obj.fun('s');

	}
}
