package anotherVisitor;

public class VisitorDemo
{
    public static void main(String[] args)
    {
        OrderParts order = new OrderParts();
        order.addParts(new Wheel());
        order.addParts(new Oil());

        order.accept(new AtvPartsShippingVisitor());
        order.accept(new AtvPartsDisplayVisitor());

//        System.out.println(order.calculateShippingCost());
    }
}
