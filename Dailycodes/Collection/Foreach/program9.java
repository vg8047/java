import java.util.*;

class CursorDemo{

	public static void main(String[] args){

		Vector v = new Vector();

		v.addElement(10);
		v.addElement("om");
		v.addElement(30);
		v.addElement(40);

		System.out.println(v);

		ListIterator cursor = v.listIterator();

		while(cursor.hasNext()){

			System.out.println(cursor.next());

		}

		while(cursor.hasPrevious()){

			System.out.println(cursor.previous());

	       }

	}
}
