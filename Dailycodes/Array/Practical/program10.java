import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array: ");

		int size = sc.nextInt();

		int arr[] = new int[size];

		int product =1;

		

	for(int i=0;i<arr.length;i++){

		arr[i] = sc.nextInt();

	}

        System.out.print("prime numbers are = "); 

       for(int i=0;i<arr.length;i++){
                
	       int count=0;
	       
	       for(int j=2;j<arr[i];j++){

		       if(arr[i]%j==0 &&  j!=arr[i] ){
                               
			       count++;
		       }

		    }

	          if(count==0){

			   System.out.print(arr[i]+" ");

		  }

		  

	       }
       System.out.println();

            
          }
     }
    
