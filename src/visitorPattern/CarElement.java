package visitorPattern;

public interface CarElement
{
    void accept(Visitor visitor);
    void printName();
}
