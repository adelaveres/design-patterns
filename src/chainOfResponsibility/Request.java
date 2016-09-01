package chainOfResponsibility;

class Request
{
    private int amount;
    private RequestType requestType;

    public Request(int amount, RequestType requestType)
    {
        this.amount = amount;
        this.requestType = requestType;
    }

    RequestType getRequestType()
    {
        return requestType;
    }
    int getAmount()
    {
        return amount;
    }
}
