import java.util.*;

class ArrayListDemo  extends ArrayList{
	public static void main(String[] args ){

	          ArrayListDemo al= new ArrayListDemo();

		al.add(20);
		al.add(10);
		al.add(20);
		al.add("vighnesh");
		al.add("om");
		al.add("vikas");
		al.add(23.2);

		System.out.println(al);

		System.out.println(al.contains(20));
		System.out.println(al.contains(10));

		System.out.println(al.get(1));

		ArrayListDemo al1=new ArrayListDemo();

		al1.add(290);


		al1.add(34);
		al1.add(56);

		System.out.println(al1);

		al.addAll(al1);

         		System.out.println(al);

		 System.out.println(al.indexOf(20));
		 System.out.println(al.lastIndexOf(20));

   

		 System.out.println(al);

		 al.removeRange(2,5);

		 System.out.println(al+"last");

	}
}
