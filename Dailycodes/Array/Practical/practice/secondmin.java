import java.util.*;
class Demo{


        public static void main(String[] args){

	 Scanner sc = new Scanner(System.in);

         System.out.print("Enter the size of array= ");

	 int size = sc.nextInt();

	 int arr[] = new int[size];

	 for(int i=0;i<size;i++){

		 arr[i] = sc.nextInt();

	  }
          
	  int firstmin = Integer.MAX_VALUE;

	  int secondmin = Integer.MAX_VALUE;

	  for(int i=0;i<size;i++){

		 if(arr[i]<firstmin){

			 secondmin = firstmin;
			 firstmin = arr[i];

		 }else if(arr[i]<secondmin && arr[i]!=firstmin){

			 secondmin = arr[i];

		 }

	
	  }

	  System.out.println("second min element = "+secondmin);

	  
      }
}

         	 
