
public class person {
	
	String firstname="Palak";
	String lastname="Shah";
	String fullname= firstname+lastname;
	
	public void persons(){
		
		System.out.println("My full name is "+firstname+ " "+lastname);
	}

	public static void main(String[] args) {

		person obj=new person();
		obj.persons();
		
	}

}
