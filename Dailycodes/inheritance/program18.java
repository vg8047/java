class Demo{

        int x =0;

	Demo(int x){


		this.x=x;

		System.out.println("in constructor");

	}

        void fun(int x){


		System.out.println(x);

		System.out.println(this.x);

	}

	public static void main(String[] args){

		Demo obj1 = new Demo(120);

		Demo obj2 = new Demo(150);

		obj1.fun(50); // 50
			      // 120

		obj2.fun(60); //60
			      //150

	}
}
