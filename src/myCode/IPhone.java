import java.util.Objects;

public class IPhone extends IDevice
{
    private double remainingMinutes;
    private String carrier;

    IPhone(final double remainingMinutes,
           final String carrier)
    {
        super("talking");
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

    @Override
    public boolean equals(Object that)
    {
        if (this == that)
        {
            return true;
        }

        if (that == null)
        {
            return false;
        }

        if (!(that instanceof IPhone))
        {
            return false;
        }

        final IPhone device;
        device = (IPhone)that;
        return remainingMinutes == device.remainingMinutesGetter();
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(remainingMinutes);
    }
}
