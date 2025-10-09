import java.util.Objects;

public abstract class IDevice
{
    private final String purpose;

    IDevice(String purpose)
    {
        this.purpose = purpose;
    }

    public abstract void printDetails();

    public String getPurpose()
    {
        return purpose;
    }

    @Override
    public String toString()
    {
        return  "purpose: " + purpose;
    }

    @Override
    public boolean equals(final Object that)
    {
        if (this == that)
        {
            return true;
        }

        if (that == null)
        {
            return false;
        }

        if (!(that instanceof IDevice))
        {
            return false;
        }

        final IDevice device;
        device = (IDevice) that;
        return this.purpose.equals(device.getPurpose());
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(this.purpose);
    }
}
