import java.util.*;
class Demo{

	public static void main(String[] args){
               
		Scanner sc = new Scanner(System.in);

		

	       double grade=sc.nextDouble();



	       if(grade>80){

		       System.out.println("first class with distinction");
	       } 

		else if(grade >60 && grade<80){

			System.out.println("first class");
		
		}else if(grade >50 ){

			System.out.println("second class");
		
		}else  if(grade>35){
                                
			System.out.println("pass");

		}else{	

			System.out.println("fail");
		}
		
	}

	}



