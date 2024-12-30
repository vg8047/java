 class Some {
   
   public static void main(String args[]){
        
	   System.out.println(Some.x);
   
    }

    static {

	    System.out.println("in static block");
       
	    System.out.println(Some.x);
    }

    static int x=90;
}
