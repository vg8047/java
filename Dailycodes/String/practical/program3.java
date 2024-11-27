import java.util.*;

class Demo{

	public static void main(String[] args){

             Scanner sc = new Scanner(System.in);

	     System.out.print("enter string1 = ");

	     String str1 = sc.nextLine();

	     System.out.print("enter string2 = ");

	     String str2 = sc.nextLine();

	    int difference = str1.compareTo(str2);

	  System.out.println("the difference is = "+difference);

	}
}


