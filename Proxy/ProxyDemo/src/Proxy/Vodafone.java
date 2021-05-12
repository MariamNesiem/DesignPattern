package Proxy;

public class Vodafone implements InternetServiceProvider{

	private int browsingSpeed=10;
	@Override
	public String getSite(String URL) {
		// TODO Auto-generated method stub
		return String.format("https://%s.com", URL);
	}
	
	public int getbrowsingSpeed() {
		return browsingSpeed;
	}

}
