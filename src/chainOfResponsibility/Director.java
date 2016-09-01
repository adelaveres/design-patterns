package chainOfResponsibility;
import static chainOfResponsibility.RequestType.CONFERENCE;

public class Director extends Handler
{
    @Override
    public void handleRequest(Request request)
    {
        if(request.getRequestType() == CONFERENCE)
        {
            System.out.println("As a DIRECTOR, I can approve conferences.");
        }
        else
        {
            succesor.handleRequest(request);
        }
    }
}

