import java.io.IOException;
import java.net.URI;
import java.util.HashSet;

import org.jsoup.*;
import org.jsoup.nodes.*;

public class KindlingArticle {
	
	private URI uri;
	private String title;
	private String topic;
	private Bias bias;

	public KindlingArticle(URI uri) {
		Document doc;
		try {
			doc = Jsoup.connect(uri.toString()).get();
		} catch (IOException e) {
			title = "";
			System.out.println("HTML read went wrong.");
			return;
		}
		this.uri = uri;
		title = doc.title();
		bias = BiasFinder.getInstance().findBias(uri.toString());
	}

	public URI getURI() {
		return uri;
	}
	
	public Bias getBias() {
		return bias;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getTopic() {
		return topic;
	}

}
