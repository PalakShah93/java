
public class MathMax {
	
	public static void main (String agrs[]){
		
		String car = "car";
		String fish ="fish";
		int mathmax = Math.max((car +fish).length(), 5);
		
		int parseint =2+Integer.parseInt("121");
		int parseint1= Integer.parseInt("122",5);
		int parseint2 =Integer.parseInt("121",9) / Integer.parseInt("123",4);
		
		System.out.println(mathmax);
		System.out.println(parseint);
		System.out.println(parseint1);
		System.out.println(parseint2);
			
	}

}
