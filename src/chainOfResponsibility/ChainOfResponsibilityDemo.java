package chainOfResponsibility;

import static chainOfResponsibility.RequestType.CONFERENCE;
import static chainOfResponsibility.RequestType.PURCHASE;

public class ChainOfResponsibilityDemo
{
    public static void main(String[] args)
    {
        Handler bryan = new Director();
        Handler crystal = new VP();
        Handler jeff = new CEO();

        bryan.setSuccesor(crystal);
        crystal.setSuccesor(jeff);

        //handled by bryan
        bryan.handleRequest(new Request(1000, CONFERENCE));
        //handled by crystal
        bryan.handleRequest(new Request(1300, PURCHASE));
        //handled by jeff
        bryan.handleRequest(new Request(2000, PURCHASE));
    }
}
