import java.util.*;

class ListDemo{
        
	public static void main(String[] args){

		List al = new ArrayList();

		al.add (10);
		al.add(20);
		al.add("Shashi");
		al.add("kanha");
		al.add(30.50);

		

		System.out.println(al);
		al.add(3, "rahul");
		al.add(5, "ashish");
		
		
		System.out.println(al);

		System.out.println(al.contains(20));

		System.out.println(al.isEmpty());
	}
}
