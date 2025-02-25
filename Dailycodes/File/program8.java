import java.io.*;

class Filewriter{

	public static void main(String[] args)throws IOException{

		FileWriter  obj = new FileWriter("om.txt");

		obj.write("flutter\n");

		obj.write("React\n");

		obj.write("java\n");

		obj.close();

		

	}

}
