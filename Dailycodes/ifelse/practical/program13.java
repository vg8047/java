import java.util.*;
class Demo{

	public static void main(String[] args){
               
		Scanner sc = new Scanner(System.in);

		double percentage=sc.nextDouble();

		if(percentage >85.00){

			System.out.println("medical");
		}else if(percentage <=80.00  && percentage >=75.00){

			 System.out.println("engineering");

		}else{
		      System.out.println("pharmacy or bsc");
		}
	}
}

