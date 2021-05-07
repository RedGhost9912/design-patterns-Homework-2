package mediator;

public class Bot {
	
private static Bot instance;
	
	
	public Bot() {
		
	}
	
	
	public static Bot getInstance() {
		
		if(instance == null) {
			
			instance = new Bot();
		}
		
		return instance;
	}
	
	
	public boolean messageSetings(String message) {
		
		if(message.contains("Cat")) {
		
			System.out.println(message + " danger messsage");
			System.out.println(" Remove user");
			return false;
		}
		
		return true;
	}
	
	

}
