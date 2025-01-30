class Outer{

	static int x  = 10;
	static void run(){

		System.out.println("in run");
	}

	static class Inner{

		
	  Inner(){

		System.out.println(x);

		run();

           }

	}

}

class Main{

	public static void main(String[] args){

		Outer.Inner obj  =  new Outer.Inner();

	}
}
