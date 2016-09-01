package visitorPattern;

public class PrintVisitor implements Visitor
{
    public void visit(CarElement carElement)
    {
        carElement.printName();
    }
}
