package anotherVisitor;

public class Oil implements AvtPart
{
    public void accept(AtvPartsVisitor atvPartVisitor)
    {
        atvPartVisitor.visit(this);
    }
}
