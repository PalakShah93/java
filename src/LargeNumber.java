
public class LargeNumber {

	
	public static void main(String args[]){
		
		int number1=10;
		int number2=90;
		int number3=500;
		
		if(number1>number2 && number1>number3){
			
			System.out.println(number1+ " is the largest number among all 3");
		}
		
		else if(number2>number3 && number2>number1){
			
			System.out.println(number2+ " is the largest number among all 3");
		}
		
		else if(number3>number2 && number3>number1){
			
			System.out.println(number3 + " is the largest number among all 3");
		}
	
		
		System.out.println("===============Nested if================");
		
		if(number1>number2){
			
			if(number1>number3){
				
				System.out.println(number1+ " is the largest number among all 3");
			}
		}
			
			else if (number2>number3){
				if(number2>number1){
					System.out.println(number2+ " is the largest number among all 3");

				}
			}
			
			else if(number3>number1){
				if(number3>number2){
					System.out.println(number3 + " is the largest number among all 3");

					
				}
			}
		
		
	}
	
}