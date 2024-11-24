class Demo{

	public static void main(String[] args){

		int arr[] = new int[6];

	
		arr[0] = 10;

		arr[1] = 20;

		arr[2] = 30;

		arr[3] = 40;

		arr[4] = 50;

		arr[5] = 60;

		System.out.println("Array elements before adding 15 : ");

		for(int i=0;i<arr.length;i++){

			System.out.print(arr[i]+" ");

		}

	            
		for(int i=0;i<arr.length;i++){

			arr[i]+=15;

		}

		System.out.println();

		System.out.println("Array elements after adding 15: ");

		for(int i=0;i<arr.length;i++){

			System.out.print(arr[i]+" ");

		}

	}

}
