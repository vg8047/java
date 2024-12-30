class Demo{

	int x = 10;

	Demo(){


		

                System.out.println("in no args constructor");

	}

	Demo(int x){

		

		System.out.println("in para-1 constructor");

	}

	Demo(int x , int y){


		System.out.println("in para-2 constructor");

	}

	public static void main(String[] args){

		Demo obj1 = new Demo();

		Demo obj2 = new Demo(10);

		Demo obj3 = new Demo(10,20);

	}
}
