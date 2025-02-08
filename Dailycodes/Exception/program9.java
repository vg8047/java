class Demo{

	public static void main(String[] args){

                  try{
                      System.out.println(10/0);
		  }

		  catch(RuntimeException e){

			  System.out.println("0 ni divide karu nako");

		  }

	}
}
