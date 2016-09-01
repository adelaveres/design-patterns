package chainOfResponsibility;

public abstract class Handler
{
    public Handler succesor;
    abstract void handleRequest(Request request);

    public void setSuccesor(Handler nextHandler)
    {
        succesor = nextHandler;
    }
}
