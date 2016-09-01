package chainOfResponsibility;

public class CEO extends Handler
{
    @Override
    void handleRequest(Request request)
    {
        System.out.println("As a CEO, I can do WHATEVER I WANT.");
    }
}
