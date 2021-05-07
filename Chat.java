package mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {

	private List<User> users;
	private Bot bot;
	
	public Chat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, User user) {
		if(message.contains("add bot")) {
			this.bot = Bot.getInstance();
			System.out.println("Bot is add");
		}
			if(bot != null) {
				this.users.remove(user);
				
				if(bot.messageSetings(message)){
					
					for(User chatUser : this.users) {
						if(user != chatUser) {
							chatUser.receive(message);
						}
					}
					
				}
			}	
		
		
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

	@Override
	public void DeleteUser(User user) {
		this.users.remove(user);
		
	}

	

}
