
public class LogicalOperator {

	public static void main(String[] args) {

		int ticket=10;
		int age=60;
		boolean isStudent= false;
		
		if (age<15 || age>=60 || isStudent){
			
			System.out.println("Hooray! You got the discout 50%. Now you need to pay $5 instead of $"+ticket);
		}
		
		else {
			System.out.println("Sorry! No discout for you. Better luck next time YAH Please pay $"+ticket+" at the counter");
		}
		
		System.out.println("===================================================================");
		
		if (age<15 || age>=60 && isStudent){
			
			System.out.println("Hooray! You got the discout 50%. Now you need to pay $5 instead of $"+ticket);
		}
		
		else {
			System.out.println("Sorry! No discout for you. Better luck next time YAH Please pay $"+ticket+" at the counter");
		}
	}

}
