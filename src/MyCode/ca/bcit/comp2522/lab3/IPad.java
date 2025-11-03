package ca.bcit.comp2522.lab3;

import java.util.Objects;

/**
 * Represents an iPad device used for learning purposes.
 * Stores information about whether it has a protective case
 * and the operating system it runs on.
 *
 * @author Arshia Adamian
 * @author Rodrick Vizigro
 * @author Indy Grewal
 * @author Abdullah Alasmy
 * @version 1.0
 */
public class IPad
        extends IDevice
{
    private boolean withCase;
    private String operatingSystem;

    /**
     * Constructs an IPad object with the specified attributes.
     *
     * @param withCase        true if the iPad has a case, false otherwise
     * @param operatingSystem the operating system of the iPad
     */
    IPad(final boolean withCase,
         final String operatingSystem)
    {
         super("learning");
         this.withCase = withCase;
         this.operatingSystem = operatingSystem;
    }

    @Override
    public void printDetails()
    {
        final String details;
        final String caseWord;

        if (withCase)
        {
            caseWord = "";
        }
        else
        {
            caseWord = "not";
        }

        details = "IPad does " + caseWord + "have a case" +
                "\nIPad's operating system is " + operatingSystem;

        System.out.println(details);
    }

    /**
     * Returns whether this iPad has a protective case.
     *
     * @return true if the iPad has a case; false otherwise
     */
    public boolean hasCase()
    {
        return withCase;
    }

    /**
     * Returns the operating system of this iPad.
     *
     * @return the operating system name
     */
    public String getOperatingSystem()
    {
        return operatingSystem;
    }

    /**
     * Updates whether this iPad has a case.
     *
     * @param withCase true if the iPad now has a case; false otherwise
     */
    public void mutateCase(final boolean withCase)
    {
        this.withCase = withCase;
    }

    /**
     * Updates the operating system of this iPad.
     *
     * @param operatingSystem the new operating system
     */
    public void mutateOperatingSystem(final String operatingSystem)
    {
        this.operatingSystem = operatingSystem;
    }

    /**
     * Returns a string representation of this iPad.
     *
     * @return a formatted string containing the iPad details
     */
    @Override
    public String toString()
    {
        final String details;
        final String caseWord;

        if (withCase)
        {
            caseWord = "";
        }
        else
        {
            caseWord = "not";
        }

        details = super.toString() +
                "\nThe iPad does " + caseWord + "have a case" +
                "\nThe iPad's operating system is " + operatingSystem;

        return details;
    }

    /**
     * Compares this iPad to another object for equality.
     * Two iPads are equal if their operating systems are equal.
     *
     * @param that the object to compare with
     * @return true if both objects are IPad instances with equal operating systems; false otherwise
     */
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

        if (!(that instanceof IPad))
        {
            return false;
        }

        final IPad device;
        device = (IPad) that;

        final boolean operatingSystemsMatch;
        operatingSystemsMatch = operatingSystem.equals(device.getOperatingSystem());

        return operatingSystemsMatch;
    }

    /**
     * Returns a hash code value for this iPad.
     *
     * @return the hash code based on the operating system
     */
    @Override
    public int hashCode()
    {
        return Objects.hashCode(this.operatingSystem);
    }
}
