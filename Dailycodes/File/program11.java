import java.io.*;

class Demo implements Serializable{

	 int id;

	 Demo(int id){

		 this.id = id;

	 }

}

class SerialDemo{

	public static void main(String[] args)throws IOException{

                     FileOutputStream fos = new FileOutputStream("sai.txt");

		     ObjectOutputStream oos = new ObjectOutputStream(fos);

		     Demo obj = new Demo(10);

		     Demo obj2 = new Demo(20);

		     oos.writeObject(obj);

		     oos.writeObject(obj2);

		     oos.close();

		     fos.close();

	}

}

class DeserialDemo{

	 public static void main(String[] args)throws Exception{

		  FileInputStream fis = new FileInputStream("om.txt");

		  ObjectInputStream ois = new ObjectInputStream(fis);

		  Demo obj1 = (Demo)ois.readObject();

		  Demo obj2 = (Demo)ois.readObject();

		  System.out.println(obj1.id);

		  System.out.println(obj2.id);

	 }
}
