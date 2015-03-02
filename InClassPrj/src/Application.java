
public class Application {

	public static void main(String[] args) {
		int counter = 0;
		boolean add = true;
		while (true) {
			
			if (counter > 10)
				add = false;
			if(add)
				counter++;
			else 
				counter--;
			
			for (int i = 0; i<=counter; i++) {
				System.out.print(" ");
			}
		System.out.println("*");
		
		}	
	}
	
}
