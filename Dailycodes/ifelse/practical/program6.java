import java.util.*;
class Demo{

	public static void main(String[] args){
                 

		Scanner sc = new Scanner(System.in);
		
		int num =sc.nextInt();

              if(num%3==0){

		      System.out.println(num+" is divisible by 3");

	      }else if(num%7==0){
    
		      System.out.println(num+" is divisible by 7");

	      }else {
		      System.out.println(num+" is nor divisible by 3 or by 7");

	      }
	}
}
