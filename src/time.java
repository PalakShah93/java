
public class time {

	public static void main(String[] args) {

		int time=18;
		String timeOfDay;
		
		if(time>=5 && time<12){
			
			System.out.println("It is morning");
		}
		else if (time>=12 && time <20){
			
			System.out.println("It is day time");
		}
		else {
			
			System.out.println("It is night");
		}
	}

}
