import java.util.*;

class ForeachDemo{

	public static void main(String[] args){

		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println(al);

		for(Object x:al){
			System.out.println(x);
		}
		
		
	}
}
