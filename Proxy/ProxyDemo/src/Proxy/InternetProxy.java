package Proxy;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements InternetServiceProvider {
	
	private List<String> blockedsites = Arrays.asList("twitter","youtube","facebook");

	@Override
	public String getSite(String URL) {
		internetLog(URL);
		if(blockedsites.contains(URL)) {
			return "This Website is blocked";
		}
		return new Vodafone().getSite(URL);
	}

	private void internetLog(String URL) {
		System.out.printf("[%d] -> %s requested \n",System.currentTimeMillis(),URL);
	}

}

