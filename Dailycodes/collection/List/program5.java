import java.util.*;
class Example{
           
	public static void main(String[] args){

		ArrayList al = new ArrayList();
		
		al.add(12);
		al.add(34);
		al.add(45);
		al.add(34);
		al.add("vighnesh");
		al.add("om apar");

		System.out.println(al);

		al.add(4,"vikas");

		al.add(2,"rahul");

		System.out.println(al);

		System.out.println(al.contains("vikas"));

		System.out.println(al.set(2,"ajay"));

	       System.out.println(al);

	       System.out.println(al.remove("ajay"));

	       System.out.println(al.get(5));

	       System.out.println(al);

	       System.out.println(al.size());

	       System.out.println(al.indexOf(34));

	       System.out.println(al.lastIndexOf(34));

	       System.out.println(al);


	        
	        


	}
}
			
