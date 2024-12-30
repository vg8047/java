class Demo{


       int x =10;

       void fun(){

	       gun();

	       System.out.println("in fun");

	       System.out.println(x);

       }

       void gun(){

	       System.out.println("in gun");

       }

       public static void main(String[] args){

	       Demo obj = new Demo();

	       obj.fun();

       }
}
