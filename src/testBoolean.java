
public class testBoolean {
	
	public static void main (String args[]){
		
		boolean isCold=true; 
		
		if(isCold){
			
			double temp=19.90; 
			System.out.println("The temperature is "+ temp + " degree celcius");
			System.out.println("Yes, It is cold outside, Please wear a coat!");
			
		}
		else {
			
			// you are not allowed to use temp variable here as it is not in to the scope
			//it is outside the curly bracket
			//If you use it, it will show an error message "temp cannot be resolved to a variable"
			System.out.println("Its too hot, don't wear a coat");
		}
	}

}
