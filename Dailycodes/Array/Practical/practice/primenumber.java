import java.util.*;
class Demo{

	public static  void main(String[] args){
 
		Scanner sc = new Scanner(System.in);

		System.out.print("enter array size = ");

		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i = 0; i<size;i++){

			arr[i] = sc.nextInt();

		}

		for(int i=0;i<size;i++){
			
			boolean flag = false;

			for(int j=2;j<=arr[i]/2;j++){

				if(arr[i]%j==0){

					flag = true;
					break;
				}
			}

			if(!flag && arr[i]!=0 && arr[i]!=1){

				System.out.println(i);
			        break;

			}
		}
	}
}

