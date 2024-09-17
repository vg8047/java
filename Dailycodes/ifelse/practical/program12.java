import java.io.*;

class Demo{

	public static void main(String[] args) throws IOException{

	           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		   

	char ch =(char) br.read();

		if(ch==97 && ch==101 && ch==105 && ch==111 &&  ch==117){

			System.out.println(ch+" is the vowel");

		}else{
			System.out.println(ch+" is the consonant");
			
		}
		
	}
}
