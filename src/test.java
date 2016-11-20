import java.net.URI;
import java.net.URISyntaxException;

public class test {

	public static void main(String[] args) throws URISyntaxException {
		// TODO Auto-generated method stub
		KindlingArticle hello = new KindlingArticle(new URI("http://www.wsj.com/articles/donald-trump-and-mitt-romney-hold-far-reaching-conversation-1479588384"));
		System.out.println(hello.getURI());
	}

}
