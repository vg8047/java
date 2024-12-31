import java.util.*;
class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int countsum = 0;

		while(num>0){
  
			int digit = num%10;

			countsum ++;

			num = num/10;

		}

		System.out.println(countsum);
	}
}
                         
