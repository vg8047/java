import java.io.*;

class Exception{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name = br.readLine();

		System.out.println(name);

		int value = br.read();

		System.out.println(value);

	}
}
