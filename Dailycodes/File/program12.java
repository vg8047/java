import java.io.*;

class Filemake{



                 public static void main(String[] args)throws IOException{

		    
	           FileReader obj = new FileReader("vg2004.txt");

		   int num = 0;
		   
		   while( (num=obj.read()) != -1){

                           
			    System.out.print((char)num);


	           }

		   obj.close();

            }
}		 
