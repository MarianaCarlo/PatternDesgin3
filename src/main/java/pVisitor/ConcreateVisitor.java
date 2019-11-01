package pVisitor;

public class ConcreateVisitor implements IVisitor {

	@Override
	public double visit(ElementConcreateA elementConcreateA) {
		System.out.println("Some process Visitor Element A");
		elementConcreateA.getAttribute2();
		return 0;
	}

	@Override
	public double visit(ElementConcreateB elementConcreateB) {
		elementConcreateB.getAttribute2();
		System.out.println("Some process Visitor Element B");
		return 0;
	}

}
