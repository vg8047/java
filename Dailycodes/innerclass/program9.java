class Outer{


	void fun(){

		Inner obj = new Inner();

	}


	class Inner{

                int x = 90;

                Inner(){

                        System.out.println("innner ");

                        System.out.println(x);



                }

        }

}

class Client{

	public static void main(String[] args){

		Outer obj = new Outer();
                 
		obj.fun();

	}
}
