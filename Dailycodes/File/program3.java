import java.io.*;

class FileDemo{

	public static void main(String[] args)throws IOException{

		File obj = new File("vighnesh.txt");

		obj.createNewFile();

		File obj1 = new File("java");

		obj1.mkdir();

	}

}


