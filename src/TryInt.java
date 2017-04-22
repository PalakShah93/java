
public class TryInt {
	
	public static void main (String args[])
	
	{
		
		int i ; // Minimum value is - 2,147,483,648 (-2^31) Maximum value is 2,147,483,647(inclusive) (2^31 -1)
		i = 10;
		byte b= -29; //Minimum -128 maximum is 127, value +- will throw error
		short s = 27000; // Minimum value is -32,768 (-2^15) Maximum value is 32,767
		long l= 1000000000000000L; // Minimum value is -9,223,372,036,854,775,808(-2^63) Maximum value is 9,223,372,036,854,775,807 (inclusive)(2^63 -1)
	
		
		System.out.println(i);
		System.out.println(b);
		System.out.println(s);
		System.out.print(l);
		System.out.println(i+b);
	}

}
