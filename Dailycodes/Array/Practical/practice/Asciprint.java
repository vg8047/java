import java.util.*;

class Demo{

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		System.out.print("Enter the size of array = ");

		int size = sc.nextInt();

		Object arr[] = new Object[size];

		System.out.println("Enter the array elements = ");

		int count =0;

		for(int i=0;i<size;i++){

			int number= sc.nextInt();

			if(number>=65 && number<=90){

				arr[i] = (char)number;
				

			}else{
				arr[i] = number;

			}

                 }

	
			for(int i=0;i<size;i++){

				System.out.println(arr[i]);

			}
		

		
	}
}

