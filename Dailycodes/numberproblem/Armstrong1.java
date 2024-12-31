import java.util.*;
class Armstrong{

	static int number;

	static int count(int num){
                 
		 int count = 0;
		 while(num>0){

                       num = num/10;
                       count++;
                }
           
	return count;
}

        static int sum(int count ){
                 
		int value = number;
                int sumvalue = 0;
                int digit = 0;

		while(value>0){

                         int powervalue = 1;

                         digit = value%10;

		         for(int i=1;i<=count;i++){

                              powervalue = digit*powervalue;
		         }

                         sumvalue = sumvalue+powervalue;
                         value = value/10;
		}

		return sumvalue;
	}

 
	static void Armcheck(int num){

		int digit = 0;

		
               int countvalue =count(num); //count mehthod call
               
	       int sumvalue =sum(countvalue);                 	         	
 
              if(sumvalue == number){
                         
                       System.out.println("the number "+number+" is armstrong number");
              }else{

                     System.out.println("the number "+number+"is not armstrong number");

          }
     }    



   public static void main(String[] args){

             Scanner sc = new Scanner(System.in);

	     System.out.println("Enter the number = ");

	      number = sc.nextInt();

              Armcheck(number);

	}
}
               

