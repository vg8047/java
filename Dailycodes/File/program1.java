import java.io.*;

class FileDemo{

	public static void main(String[] args)throws IOException{

		File obj= new File("Incubators.txt");

                obj.createNewFile();

	}
}
