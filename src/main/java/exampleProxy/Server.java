package exampleProxy;

public class Server implements IServer {
	Request request;

	public Server(Request request) {
		super();
		this.request = request;
	}

	@Override
	public void request() {
		System.out.println("Request real subject: " + this.request.getUrl() + " " + this.request.getPort());
	}

}
