package anotherVisitor;

class AtvPartsShippingVisitor implements AtvPartsVisitor
{
    double shippingAmount = 0;

    @Override
    public void visit(Oil oil)
    {
        shippingAmount += 15;
        System.out.println("Oil is expensive.");
    }

    @Override
    public void visit(Wheel wheel)
    {
        shippingAmount += 10;
        System.out.println("Wheels are bulky.");
    }

    @Override
    public void visit(OrderParts orderParts)
    {
        System.out.println("Orders are visited.\n\nShipping amount is: "+shippingAmount);
    }
}
