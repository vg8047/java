interface Demo{

	void m1();

}

class Outer{

	public static void main(String[] args){

              Demo obj = new Demo(){

		      public void m1(){

			      System.out.println("annonymous class");

		      }
	      };

	      obj.m1();

	}
}
