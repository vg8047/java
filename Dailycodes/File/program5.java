import java.io.*;

class Dirlist{

	public static void main(String[] args){

		File obj = new File("./../File");

		String name[] = obj.list();

		for(int i=0;i<name.length;i++){

			System.out.println(name[i]);

		}

		System.out.println(name.length);

	}
}
