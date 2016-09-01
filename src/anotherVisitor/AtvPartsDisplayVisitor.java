package anotherVisitor;

class AtvPartsDisplayVisitor implements AtvPartsVisitor
{
    @Override
    public void visit(Oil oil)
    {
        System.out.println("Display oil");
    }

    @Override
    public void visit(Wheel wheel)
    {
        System.out.println("Display wheel");
    }

    @Override
    public void visit(OrderParts orderParts)
    {
        System.out.println("Display order");
    }
}
