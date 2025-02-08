class Demo{


	public static void main(String[] args){

		 int arr[] = new int[]{2,3,4,1,6};

		 int i;

		 for( i = 0;i<arr.length;i++){

			 System.out.println(arr[i]);

		 }

		 try{

			 System.out.println(arr[i]);

		 }catch(RuntimeException e){

			 System.out.println("barobar tak");

		 }

	}
}
