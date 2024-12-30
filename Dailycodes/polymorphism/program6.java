class Parent{

        public String fun(){

		return "vighnesh";

	}


}
class child extends Parent{

	String fun(){

           return "om";

	}

}

class Client{

	public static void main(String[] args){

            Parent p = new child();

	    p.fun();

	}
}
