import java.util.*;

class HashDemo{

	public static void main(String[] args){

		Set lh = new LinkedHashSet();

		lh.add(10);
		lh.add(20);
		lh.add(30);
		lh.add(40);

		lh.add(50);

		lh.remove(20);

		System.out.println(lh);

	}
}
