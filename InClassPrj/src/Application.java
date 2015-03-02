
public class Application {

	public static void main(String[] args) throws InterruptedException {
		char[] nickSucks = {'N', 'I', 'C', 'K', ' ', 'S', 'U', 'C', 'K', 'S'};
		while (true) {
			for (int i = 0; i < nickSucks.length; i++) {
				System.out.print(nickSucks[i]);
				Thread.sleep(200);
			}
			System.out.println(); //add comment
		}	
	}
	
}
