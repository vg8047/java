import java.util.*;

class Listmethods extends ArrayList{
	public static void main(String[] args){
	       Listmethods al= new Listmethods();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(10);
		al.add(30);
		al.add(50);


		System.out.println(al);

		System.out.println(al.indexOf(30));

		System.out.println(al.lastIndexOf(30));

                 al.trimToSize();

		 ArrayList<String> al1 = new ArrayList<String>();
		 al1.add("vighnesh");
		 al1.add("vighnesh");
		 al1.add("vighnesh");

		 ArrayList<String> al2 = new ArrayList<String>();
                 al1.add("vighnesh");
                 al1.add("vighnesh");
                 al1.add("vighnesh");


		 al.addAll(al1);
		 al.addAll(al2);

		 System.out.println(al);
		 
		 al.removeRange(3,7);
		 System.out.println(al);

		 al.removeAll(al1);

		 System.out.println(al);
                       
		 System.out.println(al1);
		 System.out.println(al.retainAll(al1));

		 System.out.println(al);

	}
}
