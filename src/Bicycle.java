
public class Bicycle {

		double speed= 5.0;
		int gear=1;
		
		public void changegear(){
			
			gear=2;
			gear=2+1;
			System.out.println(gear);
			
			
		}
		
		public static void main(String[] args) {
			
			System.out.println("gear");
			
			Bicycle obj=new Bicycle();
			obj.changegear();
	}

}
