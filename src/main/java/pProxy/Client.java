package pProxy;

public class Client {

	public static void main(String[] args) {
		//create proxy
		ISubject proxy = new Proxy("filter hh");
		
		proxy.request();

	}

}
