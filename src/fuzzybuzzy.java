
public class fuzzybuzzy {

	public static void main(String[] args) {

		int number = 20; 
		
		if (number%3 ==0 && number%5==0)
		{
			System.out.println("FuzzyBuzzy");
		}
	
		else if (number %5==0) 
		{
			System.out.println("Buzzy");
		}
		
	    else if (number%3==0)
		{
	    System.out.println("Fuzzy");
	    }
		
		System.out.println("---------------------------------------------------");
		
		if(number%3==0){
			if(number%5==0){
				
				System.out.println("FuzzyBuzzy");
			}
			else if(number%3==0){
				
				System.out.println("Fuzzy");
			}
			else{
				System.out.println("Buzzy");
			}
		
		}
			else if(number%5==0){
				if(number%3==0){
					System.out.println("FuzzyBuzzy");
				}
				
				else if(number%5==0){
					
					System.out.println("Buzzy");
				}
				else{
					System.out.println("Fuzzy");
				}
			}
			
		}
	}
		
		
		
	



