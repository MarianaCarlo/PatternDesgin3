package exampleProxy;

public class Proxy implements IServer {
	private Request request;
	private Server realSubject = null;

	public Proxy(Request request) {
		super();
		this.request = request;
	}

	@Override
	public void request() {
		if (realSubject == null) {
			this.realSubject = new Server(request);
		}
		if (request.getPort() == 80) {
			this.realSubject.request();
		} else {
			System.out.println("Por favor utiliza el puerto : 80");
		}

	}

}
