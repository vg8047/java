import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string:");

		String info = sc.nextLine();

		StringTokenizer st = new StringTokenizer(info,",");

		String str1 = st.nextToken();

		String str2 = st.nextToken();

		String str3=st.nextToken();

		String str4 = st.nextToken();

	 System.out.println("actor name= "+str1);
	 
	 System.out.println("actor age= "+str2);

	 System.out.println("actor state = "+str3);

	}
}
