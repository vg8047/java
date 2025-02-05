interface Demo{

	void m1();

	void m2();

}

abstract class child1 implements Demo{

	public void m1(){

	}

}

class child2 extends child1 implements Demo {

	public void m2(){

	}
}
