import java.util.*;

class Demo{

	int x;

	Demo(int x){

		this.x = x;

	}

	int printData(){

		return x;

	}

	public String toString(){

                    return printData()+"";

	}

	public static void main(String[] args){

            
		Vector<Demo> v = new Vector<Demo>();

		v.addElement(new Demo(10));
		v.addElement(new Demo(20));
		v.addElement(new Demo(30));
		v.addElement(new Demo(40));

		System.out.println(v);

	}
}
