
public class USA {
	
	public static void main (String args[]){
		
		String  family ="Masi";
		boolean USA =true;
		boolean car= true;
		double temperature = 25.0;

		if(USA){
			
			System.out.println("I will meet Mahi Vraj " +family+" And Masa family");
			if(temperature<25){
				
				System.out.println(" I can enjoy in shopping centre");
			}
			else{
				
				System.out.println("I can go at beach");
			}
		}
		else if(car){
			
			System.out.println("I will go by car and the temperature is " +temperature);
		}
		else {
			
			System.out.println("I will enjoy by myself");
		}
	}

}
