
public class TrafficLight {

	public static void main (String args[]){
		
		boolean greenlight=true; 
		boolean yellowlight=true;
		boolean redlight= true; // even though this condition is true, if else will on consider the 
		//first true statement eben of the first true statement , we have other true statement too. 
		//the program will end. So only one first true statement will print out .
		
		if(greenlight){
			
			System.out.println("Continue Driving");
		}
		
		else if(yellowlight){
			
			System.out.println("Slow down NOW!!!!!");
		}
		
		else if(redlight) {
			
			System.out.println("Break STOP ");
		}
		
		if(greenlight){
			
			System.out.println("Continue Driving");
		}
		
		if(yellowlight){
			
			System.out.println("Slow down NOW!!!!!");
		}
		
		if(redlight) {
			
			System.out.println("Break STOP ");
		}
		
		
	}
}
