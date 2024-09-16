import java.util.*;

class Listmethod{

	public static void main(String[]args){

		List <String> al = new ArrayList<String>();

	//	al.add (24);
	//	al.add(34);
         //	al.add(13);
		al.add("shashi");
		al.add("vighnesh");
	//	al.add(12.2);
	//	al.add(-23);

		System.out.println(al);

		al.add(1,"rahul");
		al.add(3,"omya");

		System.out.println(al);

		System.out.println(al.contains(34));
		System.out.println(al.contains("omya"));

		System.out.println(al.get(0));
		System.out.println(al.get(3));

	//	System.out.println(al.remove(24));

		System.out.println(al.remove("omya"));


		System.out.println(al);

		al.add(3,"vg");


		System.out.println(al);

		System.out.println(al.size());
		
         	al.clear();



		System.out.println(al);
	}
}
