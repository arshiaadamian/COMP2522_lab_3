package ca.bcit.comp2522.lab3;

import java.util.Objects;

/**
 * Represents a general device with a specific purpose.
 * Subclasses must define how the details of the device are printed.
 *
 * @author Arshia Adamian
 * @author Rodrick Vizigro
 * @author Indy Grewal
 * @author Abdullah Alasmy
 * @version 1.0
 */
public abstract class IDevice
{
    private final String purpose;

    /**
     * Constructs an IDevice with the specified purpose.
     *
     * @param purpose the description of this device's purpose
     */
    IDevice(final String purpose)
    {
        this.purpose = purpose;
    }

    /**
     * Prints the details of this device.
     * Implemented by subclasses.
     */
    public abstract void printDetails();

    /**
     * Returns the purpose of this device.
     *
     * @return the purpose string
     */
    public String getPurpose()
    {
        return purpose;
    }

    /**
     * Returns a string representation of this device.
     *
     * @return a formatted string containing the purpose
     */
    @Override
    public String toString()
    {
        return "purpose: " + purpose;
    }

    /**
     * Compares this device to another object for equality.
     * Two devices are equal if they have the same purpose.
     *
     * @param that the object to compare with
     * @return true if both are IDevice instances with equal purposes; false otherwise
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

        if (!(that instanceof IDevice))
        {
            return false;
        }

        final IDevice device;
        device = (IDevice) that;

        final boolean result = purpose.equals(device.getPurpose());
        return result;
    }

    /**
     * Returns a hash code value for this device.
     *
     * @return a hash code based on the device's purpose
     */
    @Override
    public int hashCode()
    {
        return Objects.hashCode(this.purpose);
    }
}
