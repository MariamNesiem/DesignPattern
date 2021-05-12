package Proxy;

public class MainClass {

	public static void main(String[] args) {
	
		InternetServiceProvider isp = new InternetProxy();
		System.out.println(isp.getSite("Mariam"));
	}

}
