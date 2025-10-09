public class IPhone extends IDevice
{
    private double remainingMinutes;
    private String carrier;

    IPhone(final String purpose, final double remainingMinutes, final String carrier)
    {
        super(purpose);
        this.remainingMinutes = remainingMinutes;
        this.carrier = carrier;
    }

    @Override
    public void printDetails()
    {
        String details = "The remaining minutes on this iPhone is " + remainingMinutes +
                          "\nThe carrier is " + carrier;

        System.out.println(details);
    }

    public double remainingMinutesGetter()
    {
        return remainingMinutes;
    }

    public String carrierGetter()
    {
        return carrier;
    }

    public void remainingMinutesMutator(final double remainingMinutes)
    {
        this.remainingMinutes = remainingMinutes;
    }

    public void carrierMutator(final String carrier)
    {
        this.carrier = carrier;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "\nThe remaining minutes is: " + remainingMinutes +
                "\nThe carrier is: " + carrier;
    }
}
