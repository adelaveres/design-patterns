package chainOfResponsibility;
import static chainOfResponsibility.RequestType.PURCHASE;

public class VP extends Handler
{
    @Override
    void handleRequest(Request request)
    {
        if(request.getRequestType() == PURCHASE)
        {
          if(request.getAmount() < 1500)
          {
              System.out.println("As a VP, I can approve a purchase of: " + request.getAmount() + "$.");
          }
          else
          {
              succesor.handleRequest(request);
          }
        }
        else
        {
            succesor.handleRequest(request);
        }
    }
}
