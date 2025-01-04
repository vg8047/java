import java.util.*;
class Demo{


        public static void main(String[] args){

	 Scanner sc = new Scanner(System.in);

         System.out.print("Enter the number= ");

	 int  number = sc.nextInt();

	 int value = number;

         int digit = 0;

	 int size =0;

	 while(number>=1){

		 size++;

		number= number/10;
	 }

	 int arr[] = new int[size];

	 int i=size-1;

	 while(value>=1){
         
		 digit = value%10;

                 arr[i] =digit+1;

		 value = value/10;

		 i--;

	 }

	 for( i=0;i<arr.length;i++){

	  System.out.print(arr[i]+" ");

	  
         }
     }
}

         	 
