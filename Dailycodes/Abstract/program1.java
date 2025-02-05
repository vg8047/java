abstract   class parent{

      void career(){

		 System.out.println("software engineering");

	 }

	 void marry(){

		 System.out.println("disha patani");

	 }

	abstract void gun();


	
}

 class child extends parent{

	void marry(){

		System.out.println("disha patani");

	}

	void gun(){

	}

}


class Client{

	public static void main(String[] args){

		parent obj = new child();

		obj.career();
		obj.marry();

	}
}


