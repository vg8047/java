import java.util.*;

class ForeachDemo{
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>();

		al.add("vighnesh");
		al.add("rahul");
		al.add("om");
		al.add("vikas");

		System.out.println(al);
		
		for(String name:al){
			System.out.println(name);
		}
	}
}


