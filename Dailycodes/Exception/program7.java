import java.io.*;
class FileException{

	public static void main(String[] args)throws IOException{

		File obj = new File("abc.txt");

		FileReader fr = new FileReader(obj);

		System.out.println(fr.read());

	}
}
