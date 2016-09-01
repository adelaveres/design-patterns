package visitorPattern;

public class Wheel2 implements CarElement
{
    @Override
    public void printName()
    {
        System.out.println("I'm a wheel.");
    }

    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
