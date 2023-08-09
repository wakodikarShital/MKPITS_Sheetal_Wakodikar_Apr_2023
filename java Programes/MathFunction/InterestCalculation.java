public class InterestCalculation {
    private final float  RateOfInterest;
    public InterestCalculation()
    {
        RateOfInterest=6.8f;
    }
    public final void CalculateInterest(String accountNumber, double amount, int duration)
    {
        System.out.println("interest = "+(amount+duration/12));
    }
}
