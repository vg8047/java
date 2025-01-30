class Outer{

	Outer(){
		System.out.println("outer address = "+this);

	}

	class Inner1{

		Inner1(){

			System.out.println("inner 1 address= "+this);

			System.out.println("outer address=  "+Outer.this);

		}

		class Inner2{

			Inner2(){

				System.out.println("inner 2 address = "+this);
				System.out.println("inner 1 address = "+Inner1.this);
                                System.out.println("outer address = "+Outer.this);

			}

		      class Inner3{

			      Inner3(){

			      System.out.println("inner3 address = "+this);
			      System.out.println("inner 2 address = "+Inner2.this);
			      System.out.println("inner1 address = "+Inner1.this);
                           }

		      }
		}
	}
 public static void main(String[] args){

      Outer obj  = new Outer();

      Inner1 inobj = obj.new Inner1();

      Inner1.Inner2 inobj2 = inobj.new Inner2();

 }
} 
