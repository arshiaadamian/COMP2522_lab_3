package ca.bcit.comp2522.lab3;

/**
 * Represents an iPod device used for music purposes.
 * Stores the number of songs and the maximum volume (in dB).
 * <p>
 * Invariants: numberOfSongs >= 0; maxVolumeDB >= 0.
 *
 * @author Arshia Adamian
 * @author Rodrick Vizigro
 * @author Indy Grewal
 * @author Abdullah Alasmy
 * @version 1.0
 */

import java.util.Objects;

public class IPod extends IDevice {

    private int numberOfSongs;
    private double maxVolumeDB;

    /**
     * Constructs an IPod with the given song count and maximum volume.
     *
     * @param numberOfSongs the number of songs stored
     * @param maxVolumeDB   the maximum volume in decibels (dB)
     */
    IPod(final int numberOfSongs,
         final double maxVolumeDB) {
        super("music");
        this.numberOfSongs = numberOfSongs;
        this.maxVolumeDB = maxVolumeDB;
    }

    /**
     * Prints the details of this iPod.
     */
    @Override
    public void printDetails() {
        String details = "The number of songs stored is " + numberOfSongs +
                "\nThe maximum volume is " + maxVolumeDB;

        System.out.println(details);
    }

    /**
     * Returns the number of songs stored on this iPod.
     *
     * @return the number of songs
     */
    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    /**
     * Updates the number of songs stored on this iPod.
     *
     * @param newNumberOfSongs the new song count
     */
    public void mutateNumberOfSongs(final int newNumberOfSongs) {
        numberOfSongs = newNumberOfSongs;
    }

    /**
     * Returns the maximum volume in decibels (dB).
     *
     * @return the maximum volume (dB)
     */
    public double getMaxVolume() {
        return maxVolumeDB;
    }

    /**
     * Updates the maximum volume in decibels (dB).
     *
     * @param maxVolumeDB the new maximum volume (dB)
     */
    public void mutateMaxVolume(final double maxVolumeDB) {
        this.maxVolumeDB = maxVolumeDB;
    }

    /**
     * Returns a string representation of this iPod.
     *
     * @return a formatted string with song count and max volume
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nnumber of songs is: " + numberOfSongs +
                "\nmax voluem is: " + maxVolumeDB;
    }

    /**
     * Compares this iPod to another object for equality.
     * Two iPods are equal if they have the same number of songs.
     *
     * @param that the object to compare with
     * @return true if both are IPod instances with equal song counts; false otherwise
     */
    @Override
    public boolean equals(final Object that) {
        if (this == that) {
            return true;
        }

        if (that == null) {
            return false;
        }

        if (!(that instanceof IPod)) {
            return false;
        }

        final IPod device;
        device = (IPod) that;

        final boolean numberOfSongsMatch;
        numberOfSongsMatch = numberOfSongs == device.getNumberOfSongs();

        return numberOfSongsMatch;
    }

    /**
     * Returns a hash code value for this iPod.
     *
     * @return a hash code based on the number of songs
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(numberOfSongs);
    }
}
