public class IPod extends IDevice
{
    private int numberOfSongs;
    private double maxVolume;

    IPod(final String purpose,
         final int numberOfSongs,
         final double maxVolume)
    {
        super(purpose);
        this.numberOfSongs = numberOfSongs;
        this.maxVolume = maxVolume;
    }

    @Override
    public void printDetails()
    {
        String details = "The number of songs stored is " + numberOfSongs +
                "\nThe maximum volume is " + maxVolume;

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
        return maxVolume;
    }

    public void maxVolumeMutator(final double newMaxVolume)
    {
        maxVolume = newMaxVolume;
    }

    @Override
    public String toString()
    {
       return super.toString() +
                "\nnumber of songs is: " + numberOfSongs +
               "\nmax voluem is: " + maxVolume;
    }

}
