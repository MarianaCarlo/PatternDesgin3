package pProxy;

public class Proxy implements ISubject {
	private String attribute;
	private RealSubject realSubject = null;

	public Proxy(String attribute) {
		super();
		this.attribute = attribute;
		// this.realSubject = new RealSubject(attribute);
	}

	@Override
	public void request() {
		if (realSubject == null) {
			this.realSubject = new RealSubject(attribute);
		}
		if (attribute.contains("filter")) {
			this.realSubject.request();
		} else {
			System.out.println("blocked");
		}

	}

}
