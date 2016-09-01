package anotherVisitor;

interface AtvPartsVisitor
{
    void visit(Wheel wheel);
    void visit(Oil oil);
    void visit(OrderParts orderParts);
}
