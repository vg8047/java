import java.util.*;
class Demo{

	static boolean iscomposite(int num){

                   if(num<=1){

			   return false;

		   }else{
			   for(int i=2;i<=num/2;i++){

				   if(num%i==0){

					   return true;

				   }
			   }
		   }

	       return false;
	}

        public static void main(String[] args){

	 Scanner sc = new Scanner(System.in);

         System.out.print("Enter the size of array= ");

	 int size = sc.nextInt();

	 int arr[] = new int[size];

	 for(int i=0;i<size;i++){

		 arr[i] = sc.nextInt();

	  }
	  for(int i=0;i<size;i++){

		 if(iscomposite(arr[i])){

			 System.out.println(arr[i]);
		 }
	 }
      }
}

         	 
