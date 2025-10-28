package ca.bcit.comp2522.lab3;

/**
 * Represents an iPhone device used for talking purposes.
 * Stores information about its remaining minutes and carrier.
 * <p>
 * Invariant: carrier is non-null.
 *
 * @author Arshia Adamian
 * @author Rodrick Vizigro
 * @author Indy Grewal
 * @author Abdullah Alasmy
 * @version 1.0
 */

import java.util.Objects;

public class IPhone extends IDevice {
    private double remainingMinutes;
    private String carrier;

    /**
     * Constructs an IPhone object with the specified remaining minutes and carrier.
     *
     * @param remainingMinutes the remaining talk minutes
     * @param carrier          the carrier name
     */
    IPhone(final double remainingMinutes,
           final String carrier) {
        super("talking");
        this.remainingMinutes = remainingMinutes;
        this.carrier = carrier;
    }

    /**
     * Prints the details of this iPhone.
     */
    @Override
    public void printDetails() {
        final String details;
        details = "The remaining minutes on this iPhone is " + remainingMinutes +
                "\nThe carrier is " + carrier;
        System.out.println(details);
    }

    /**
     * Returns the remaining minutes on this iPhone.
     *
     * @return the remaining minutes
     */
    public double getRemainingMinutes() {
        return remainingMinutes;
    }

    /**
     * Returns the carrier name of this iPhone.
     *
     * @return the carrier name
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Updates the remaining minutes on this iPhone.
     *
     * @param remainingMinutes the new number of remaining minutes
     */
    public void mutateRemainingMinutes(final double remainingMinutes) {
        this.remainingMinutes = remainingMinutes;
    }

    /**
     * Updates the carrier associated with this iPhone.
     *
     * @param carrier the new carrier name
     */
    public void mutateCarrier(final String carrier) {
        this.carrier = carrier;
    }

    /**
     * Returns a string representation of this iPhone.
     *
     * @return a formatted string containing the iPhone details
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nThe remaining minutes is: " + remainingMinutes +
                "\nThe carrier is: " + carrier;
    }

    /**
     * Compares this iPhone to another object for equality.
     * Two iPhones are equal if their remaining minutes are the same.
     *
     * @param that the object to compare with
     * @return true if both are IPhone instances with equal remaining minutes; false otherwise
     */
    @Override
    public boolean equals(final Object that) {
        if (this == that) {
            return true;
        }

        if (that == null) {
            return false;
        }

        if (!(that instanceof IPhone)) {
            return false;
        }

        final IPhone device;
        device = (IPhone) that;
        return this.remainingMinutes == device.getRemainingMinutes();
    }

    /**
     * Returns a hash code value for this iPhone.
     *
     * @return the hash code based on remaining minutes
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(this.remainingMinutes);
    }
}
