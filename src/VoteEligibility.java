public class VoteEligibility {
	
	public void vote(){
		
	int age=9; 
		
		if(age>=18){
			
			System.out.println("you are eligible for voting");
		}
		
		else{
			
			System.out.println("You are not eligible for voting, please come once you turn 18");
		}
	}
	
	public void gender(){ 
		
	String genderf="Female";
	String genderm="Male";
	
	System.out.println("If you are "+genderf +" than come to vote at 10am and if you are " + genderm+ " come for vote at 12:00 noon");
	}
	
	public void evenNumber(){
		
		int number=101;
		
		if(number%2==0){
			
			System.out.println("The number is even");
		}
		
		else{
			
			System.out.println("The number is odd");
		}
	}


	public static void main(String[] args) {
		
		
		VoteEligibility obj= new VoteEligibility(); //Creating an object
		obj.vote(); //calling vote method 
		obj.gender();//calling gender method 
		obj.evenNumber();
	
	}

}
