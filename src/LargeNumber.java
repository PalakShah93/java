
public class LargeNumber {

	
	public static void main(String args[]){
		
		int number1=40;
		int number2=1590;
		int number3=10;
		
		if(number1>number2 && number1>number3){
			
			System.out.println(number1+ " is the larger number");
		}
		
		else if(number2>number3 && number2>number1){
			
			System.out.println(number2+ " is the larger number");
		}
		
		else if(number3>number2 && number3>number1){
			
			System.out.println(number3 + " is the larger number");
		}
	}
	
}