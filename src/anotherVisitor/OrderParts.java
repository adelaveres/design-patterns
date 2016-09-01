package anotherVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderParts implements AvtPart
{
    List<AvtPart> orderedParts = new ArrayList<>();

    public void addParts(AvtPart avtPart)
    {
        orderedParts.add(avtPart);
    }

    public List<AvtPart> getOrderedParts()
    {
        return Collections.unmodifiableList(orderedParts);
    }

    public void accept(AtvPartsVisitor avtPartsVisitor)
    {
        orderedParts.stream().forEach(avtPart -> avtPart.accept(avtPartsVisitor));
        avtPartsVisitor.visit(this);
    }
}
