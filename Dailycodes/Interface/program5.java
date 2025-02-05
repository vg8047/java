interface Parent{
     
	void career();

	void marry();

}

class child implements Parent{


	public void career(){

		System.out.println("ceo");

	}

	public void marry(){

		System.out.println("disha");

	}



	
}

class Client{

	public static void main(String[] args){

		Parent obj = new child();

		obj.career();
		obj.marry();

	}
}
