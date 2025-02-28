import java.util.*;

class CustomString implements Comparable<CustomString>{

	String str = null;

	CustomString(String str){

		this.str = str;

	}

	public int compareTo(CustomString obj){

		return -(str.compareTo(obj.str));

	}

	public String toString(){

		return str;

	}
}

class SortDemo{

	public static void main(String[] args){

		TreeSet ts = new TreeSet();

		ts.add(new CustomString("kanha"));

		ts.add(new CustomString("arjun"));
		ts.add(new CustomString("om"));
		ts.add(new CustomString("vighnesh"));

		System.out.println(ts);

	}
}
