import java.util.*;
class Prime{


	static void Primeprint(int num){

		int valuecount = 0;

		for(int i=2;i<=num;i++){

			int count =0;

			for(int j=2;j<i;j++){
                           
				if(i%j==0 || i==1){

					count++;
                               }
			}

			if(count==0){

                               
			        valuecount++;
				System.out.println(i);

				
			}

			
		}

		System.out.println(valuecount);
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number = ");

	        int number = sc.nextInt();

		Primeprint(number);

	}
	
}


