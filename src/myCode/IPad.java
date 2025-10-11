import java.util.Objects;

public class IPad extends IDevice
{
    private boolean hasCase;
    private String operatingSystem;

    IPad(boolean hasCase,
         String operatingSystem)
    {
        super("learning");
        this.hasCase = hasCase;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void printDetails()
    {
        String details = "IPad does " + (hasCase ? "" : "not") + " have a case" +
                            "\nIPad's operating system is " + operatingSystem;

        System.out.println(details);
    }

    public boolean hasCaseGetter()
    {
        return hasCase;
    }

    public String operatingSystemGetter()
    {
        return operatingSystem;
    }

    public void hasCaseMutator(final boolean hasCase)
    {
        this.hasCase = hasCase;
    }

    public void operatingSystemMutator(final String operatingSystem)
    {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "\nThe iPad does " + (hasCase ? "" : "not ") + "have a case" +
                "\nThe iPad's operatingSystem is " + operatingSystem;
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

        if (!(that instanceof IPad))
        {
            return false;
        }

        final IPad device;
        device = (IPad) that;
        return this.operatingSystem.equals(device.operatingSystemGetter());
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(this.operatingSystem);
    }
}
