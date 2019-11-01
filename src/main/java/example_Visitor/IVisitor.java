package example_Visitor;

public interface IVisitor {
	public double visit(Estudiante estudiante);
	public double visit(Director director);
}
