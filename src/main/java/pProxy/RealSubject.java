package pProxy;

public class RealSubject implements ISubject {
	String attribute;

	public RealSubject(String attribute) {
		super();
		this.attribute = attribute;
	}

	@Override
	public void request() {
		System.out.println("Request real subject: " + this.attribute);
	}

}
