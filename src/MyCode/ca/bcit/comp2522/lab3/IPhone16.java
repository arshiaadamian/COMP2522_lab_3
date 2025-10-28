package ca.bcit.comp2522.lab3;

/**
 * Represents an iPhone 16, a subclass of IPhone that adds
 * high-resolution camera capability and additional memory information.
 * <p>
 * Invariant: memoryGB is non-negative.
 *
 * @author Arshia Adamian
 * @author Rodrick Vizigro
 * @author Indy Grewal
 * @author Abdullah Alasmy
 * @version 1.0
 */

import java.util.Objects;

public class IPhone16 extends IPhone {

    private boolean highResolutionCamera;
    private int memoryGB;

    /**
     * Constructs an IPhone16 object with the specified properties.
     *
     * @param remainingMinutes     the remaining talk minutes
     * @param carrier              the carrier name
     * @param highResolutionCamera true if the phone has a high-resolution camera
     * @param memoryGB             the memory capacity in gigabytes
     */
    IPhone16(final double remainingMinutes,
             final String carrier,
             final boolean highResolutionCamera,
             final int memoryGB) {
        super(remainingMinutes, carrier);
        this.highResolutionCamera = highResolutionCamera;
        this.memoryGB = memoryGB;
    }

    /**
     * Returns whether this iPhone 16 has a high-resolution camera.
     *
     * @return true if the iPhone 16 has a high-resolution camera; false otherwise
     */
    public boolean getHighResolutionCamera() {
        return highResolutionCamera;
    }

    /**
     * Updates the high-resolution camera setting for this iPhone 16.
     *
     * @param highResolutionCamera true if the phone now has a high-resolution camera; false otherwise
     */
    public void mutateHighResolutionCamera(final boolean highResolutionCamera) {
        this.highResolutionCamera = highResolutionCamera;
    }

    /**
     * Returns the memory capacity of this iPhone 16.
     *
     * @return the memory in gigabytes
     */
    public int getMemoryGB() {
        return memoryGB;
    }

    /**
     * Updates the memory capacity of this iPhone 16.
     *
     * @param memoryGB the new memory capacity in gigabytes
     */
    public void mutateMemoryGB(final int memoryGB) {
        this.memoryGB = memoryGB;
    }

    /**
     * Returns a string representation of this iPhone 16.
     *
     * @return a formatted string containing the iPhone 16 details
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nIPhone16 does" + (highResolutionCamera ? " " : " not ") +
                "have a high-resolution camera" +
                "\nIPhone16 has " + memoryGB + " gigabytes of memory";
    }

    /**
     * Compares this iPhone 16 to another object for equality.
     * Two IPhone16 objects are equal if they have the same remaining minutes
     * and the same high-resolution camera setting.
     *
     * @param that the object to compare with
     * @return true if both are IPhone16 instances with equal values; false otherwise
     */
    @Override
    public boolean equals(final Object that) {
        if (this == that) {
            return true;
        }

        if (that == null) {
            return false;
        }

        if (!(that instanceof IPhone16)) {
            return false;
        }

        final IPhone16 device;
        device = (IPhone16) that;
        final boolean minutesAndResolutionMatch;

        minutesAndResolutionMatch = (this.getRemainingMinutes() == device.getRemainingMinutes())
                && (this.highResolutionCamera == device.getHighResolutionCamera());

        return minutesAndResolutionMatch;
    }

    /**
     * Returns a hash code value for this iPhone 16.
     *
     * @return a hash code based on the remaining minutes
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(this.getRemainingMinutes());
    }
}
