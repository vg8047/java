import java.util.*;
class ArrayListmethods extends ArrayList{

	public static void main(String[] args){

		ArrayListmethods al = new ArrayListmethods();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println(al);

		System.out.println(al.indexOf(30));
           		
		System.out.println(al.lastIndexOf(30));



	}
}
