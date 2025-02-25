import java.io.*;

class FileDemo{

	public static void main(String[] args){

		File obj = new File("/home/vighnesh/java/java/Dailycodes/File");

		String name[] = obj.list();

		System.out.println(name.length);

	}

}
