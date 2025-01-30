class Outer{

	Outer(){

		System.out.println("in outer");

	}

	class Inner{
        
		Inner(){
			
			System.out.println("in inner");

		}

       }

       public static void main(String[] args){

	       Outer obj =  new Outer();

	       Inner obj1 = obj.new Inner();

	       Inner obj2 = new Outer().new Inner();

       }
}
