package exampleProxy;

public class Client {

	public static void main(String[] args) {
		//create proxy
		IServer proxy = new Proxy(new Request("youtube", 90));
		proxy.request();

	}

}
