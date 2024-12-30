class Demo{

	void fun(int x,int y){

		System.out.println("in int-int fun");

	}

	 void fun(int x,float y){
                
                System.out.println("in int-int fun");
                
        }       
        
         
	 void fun(float x,int y){

                System.out.println("in int-int fun");

        }

         void fun(float x,float y){
                
                System.out.println("in int-int fun");
                
        }       
        

	public static void main(String[] args){

		Demo obj = new Demo();

		obj.fun(10,10);

	}
}

