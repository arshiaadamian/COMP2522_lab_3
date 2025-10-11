import java.util.Objects;

public class IPod extends IDevice
{
    private int numberOfSongs;
    private double maxVolumeDB;

    IPod(final int numberOfSongs,
         final double maxVolumeDB)
    {
        super("music");
        this.numberOfSongs = numberOfSongs;
        this.maxVolumeDB = maxVolumeDB;
    }

    @Override
    public void printDetails()
    {
        String details = "The number of songs stored is " + numberOfSongs +
                "\nThe maximum volume is " + maxVolumeDB;

        System.out.println(details);
    }

    public int numberOfSongsGetter()
    {
        return numberOfSongs;
    }

    public void numberOfSongsMutator(final int newNumberOfSongs)
    {
        numberOfSongs = newNumberOfSongs;
    }

    public double maxVolumeGetter()
    {
        return maxVolumeDB;
    }

    public void maxVolumeMutator(final double maxVolumeDB)
    {
        this.maxVolumeDB = maxVolumeDB;
    }

    @Override
    public String toString()
    {
       return super.toString() +
                "\nnumber of songs is: " + numberOfSongs +
               "\nmax voluem is: " + maxVolumeDB;
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

        if (!(that instanceof IPod))
        {
            return false;
        }

        final IPod device;
        device = (IPod)that;
        return numberOfSongs == device.numberOfSongsGetter();
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(numberOfSongs);
    }

}
