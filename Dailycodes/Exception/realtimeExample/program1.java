class OrderDelayedException  extends RuntimeException{

	    OrderDelayedException(String str){

		    super(str);

	    }
}

class Zomato{

        boolean rainoccur = true;  

	 boolean rainstatus(){

		   if(rainoccur == true)
			   return rainoccur;
		   else
			   return rainoccur;
	 }

	void order(String str){

		 boolean raincheck = rainstatus();

		 if(raincheck == true){

			 throw new OrderDelayedException("Order delayed due to heavy rain");

		 }else{
			 System.out.println("preparing the "+str);

		 }
	}

}


class client{

	public static void main(String[] args){

		 Zomato obj = new Zomato();

		 obj.order("Biryani");

	}
}
