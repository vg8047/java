class parent{

	void  marry(double x){

		System.out.println("alia bhatt");
                
	} 

}

class child extends parent {	

	 void marry(float y){

		System.out.println("disha");
                
	}

}

class Client{

	public static void main(String[] args){

		parent p = new child();

		p.marry(4.5);

	}
}
