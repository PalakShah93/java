
public class LargeNumber {

	public static void main (String args[]){
		
		int x=100;
		int y=30;
		int z=20;
		
		
		if(z>x || z>y){
			
			System.out.println(z+" is larger number");
		}
		
		else if( x>y || x>z){
			
			System.out.println(x+ " Is the latger number");
		}
		
		else if(y>x || y>z){
			
			System.out.println(y+ " is the larger number");
		}
		
		
		
		System.out.println("=========================================");
		
		
		
		
		if(y>x){
			
			System.out.println("The greater number is "+y);
		} 
		
	
		else if(x>y){
			System.out.println("The greater number is "+x);
		}
		
		else if(z>x){
			
			System.out.println("The greater number is "+z);
		}
		
		else if(z>y){
			System.out.println("The greater number is "+z);
		}
		
		else if(y>z){
			
			System.out.println("The greater number is "+y);
		}
		
		else  if(x>z){
			
			System.out.println("The greater number is "+x);
		}
		
		
	
		
		
		
	}
	
}
