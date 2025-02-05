interface parent{

	void career();

	void marry();

}

interface child1{

	void stream();

}

class grandparent{

	void property(){

		System.out.println("land");

	}
}

class client extends grandparent implements parent,child1{

	public void career(){

		System.out.println("software eng");

	}

	public void marry(){

		System.out.println("disha");

	}

	public void stream(){

		System.out.println("youtube");
	}
}
