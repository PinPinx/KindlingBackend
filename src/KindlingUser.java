import java.util.ArrayList;
import java.util.List;

public class KindlingUser {

	private int userID;
	private Reaction articleReaction;
	private KindlingArticle currentArticle;
	private List<KindlingChat> chatList;
	private KindlingChat currentChat;
	private boolean inChatQueue;
	
	public KindlingUser(int ID, Reaction reaction,
			KindlingArticle article, KindlingChat articleChat) {
		userID = ID;
		articleReaction = reaction;
		currentArticle = article;
		inChatQueue = false;
		chatList = new ArrayList<KindlingChat>();
		chatList.add(articleChat);
		currentChat = articleChat;
	}
	
	public void addChat(KindlingChat newChat) {
		chatList.add(newChat);
		currentChat = newChat;
	}
	
	
}
