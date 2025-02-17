import java.io.*;

class Demo{

	public static void main(String[] args){

		try{
			throw new IOException("stream close");

		}catch(Exception np){

		}catch(IOException ioe){

		}
	}
}
