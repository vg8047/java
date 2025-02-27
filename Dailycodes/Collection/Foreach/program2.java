import java.util.*;

class ForEachDemo{

	public static void main(String[] args){

		ArrayList al = new ArrayList();

		al.add(10);
		al.add("vighnesh");
		al.add(30.5f);
		al.add(40.5);
		al.add(50L);

		System.out.println(al);

		for(Object x: al){

			System.out.println(x);

		}

		System.out.println(al);

	}
}
