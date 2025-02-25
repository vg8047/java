import java.io.*;

class FileDemo {

	public static void main(String[] args){


		File obj = new File("./../File");

		String name[] = obj.list();

                System.out.println(obj.isDirectory());

		System.out.println(obj.isFile());

	}
}
