public class IPad extends IDevice
{
    private boolean hasCase;
    private String operatingSystem;

    IPad(String purpose, boolean hasCase, String operatingSystem)
    {
        super(purpose);
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
}
