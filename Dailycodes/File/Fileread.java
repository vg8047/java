import java.io.*;

class Fileread{

	public static void main(String[] args)throws IOException{

		FileReader obj = new FileReader("om.txt");

		int ch;

		while((ch=obj.read())!=-1){

			System.out.println((char)ch);

		}

		obj.close();

	}
}
