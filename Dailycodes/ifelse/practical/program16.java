import java.util.*;
class Demo{

	public static void main(String[] args){
               
		Scanner sc = new Scanner(System.in);

		System.out.print("costprice =");

		int costprice=sc.nextInt();

		System.out.print("selling price =");

		int sellingprice = sc.nextInt();



	    int	profit=sellingprice - costprice;
               
	    int loss=costprice -sellingprice;


		if(sellingprice>costprice){

			System.out.println("profit of ="+profit);
		
		}else if(sellingprice < costprice){

			System.out.println("loss of =" + loss);

		}else{
			System.out.println("No profit or no loss");
		}
	}

}

