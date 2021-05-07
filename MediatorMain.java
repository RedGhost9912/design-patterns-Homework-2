package mediator;

public class MediatorMain {

	
	public static void main(String[] args) {
		
		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat," Dori");
		User user2 = new ChatUser(chat," Dave");
		User user3 = new ChatUser(chat," Stive");

		
		user2.send(" Heyy guy");
		user3.send(" add bot");
		user1.send(" Cat");
		user3.send(" Hello");
		
		
		
	}

}
