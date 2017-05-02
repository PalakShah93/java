import java.util.Random;

public class RollADice {
 
		static int roll(){
			Random r=new Random();
			return r.nextInt(6)+1;

		}
		public static void main (String args[]){
		int count =0;
		boolean found =false;
	
		while(!found){
			
			count++;
			int a=roll();
			int b=roll();
			int c=roll();
			if(a==1 && b==1 && c==1){
				
				count++;
				found=true;
			
		}
			
		}
		
		System.out.println(count);
	}

}
