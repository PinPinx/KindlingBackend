import java.net.URI;
import java.util.HashMap;

final class ArticleManager {

    private static final ArticleManager INSTANCE = new ArticleManager();
    HashMap<KindlingArticle, KindlingChat> chatMap = new HashMap<>();
    HashMap<URI, KindlingArticle> articleMap = new HashMap<>();

    private ArticleManager() {
    }

    static ArticleManager getInstance() {
        return INSTANCE;
    }

    void joinGroupChatForArticle(KindlingArticle article) {
        if (chatMap.containsKey(article)) {
            KindlingChat chat = chatMap.get(article);
            // join the chat
        } else {
            KindlingChat chat = new KindlingChat();
            chatMap.put(article, chat);
            // join the chat
        }
    }

    void joinPrivateChatForArticle(KindlingArticle article) {
        if (chatMap.containsKey(article)) {
            KindlingChat chat = chatMap.get(article);
            // join the chat
        } else {
            KindlingChat chat = new KindlingChat();
            chatMap.put(article, chat);
            // join the chat
        }
    }

    private void addToArticle() {
        if ()
    }
}
