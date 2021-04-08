package assignment3;

public class Question7 {

	public static void main(String[] args) {

		int price, quarters,dimes,nickel ; 
		
		price=95; 
		
		
		quarters=(100-price)/25;
		dimes=((100-price)%25)/10;
		nickel= (((100-price)%25)%10)/5;
		
		System.out.println("Price in cents : "+price);
		System.out.println("Your change is "+quarters +", "+dimes+" dimes, and "+nickel+" nickles");
		
	}

}
