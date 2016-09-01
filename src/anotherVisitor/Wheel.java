package anotherVisitor;

public class Wheel implements AvtPart
{
    public void accept(AtvPartsVisitor atvPartVisitor)
    {
        atvPartVisitor.visit(this);
    }
}
