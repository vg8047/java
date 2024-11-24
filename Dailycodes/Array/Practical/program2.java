class Demo{

	public static void main(String[] args){

		int arr[] = new int[6];

		arr[0] = 1;

		arr[1] = 5;

		arr[2] = 9;

		arr[3] = 8;

		arr[4] = 7;

		arr[5] = 6;
             
		int count=0;

	  for(int i=0;i<arr.length;i++){

		  if(arr[i] == 5){

			   count = i;

			 }

	  }

	    if(arr[count]==5){

		    System.out.println("the starting index of 5 is "+count);

	    }else{

		    System.out.println("number not found ");

	    }

	  

	}

}

