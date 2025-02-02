class Outer{

	void marry(){

		System.out.println("bhoite");

	}

	void fun(Outer obj){

		obj.marry();

	}

	public static void main(String[] args){
           
		 Outer obj = new Outer();

		 obj.fun( 

			new Outer(){

				void marry(){

					System.out.println("gambhire");

				}
			}
		);

	}
}

