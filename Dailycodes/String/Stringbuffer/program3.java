class Demo{

	public static void main(String[] args){

		StringBuffer sb = new StringBuffer("vighnesh");

		System.out.println(sb);

		System.out.println(System.identityHashCode(sb));

		System.out.println(sb.capacity());

		sb = sb.append("belkar");

		System.out.println(sb);
                
                System.out.println(System.identityHashCode(sb));
                
                System.out.println(sb.capacity());

	
                
          }

}
