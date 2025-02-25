import java.io.*;

class FileDemo{

	public static void main(String[] args)throws IOException{

		File obj = new File("Incubators");

		obj.createNewFile();

		File obj2 = new File("Java2025");

		obj.mkdir();

	}
}
