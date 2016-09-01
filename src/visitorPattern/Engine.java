package visitorPattern;

public class Engine implements CarElement
{
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public void printName()
    {
        System.out.println("I'm an engine.");
    }
}
