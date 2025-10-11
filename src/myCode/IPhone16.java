import java.util.Objects;

public class IPhone16 extends IPhone
{
    private boolean highResolutionCamera;
    private int memoryGB;

    IPhone16(final double remainingMinutes,
             final String carrier,
             final boolean highResolutionCamera,
             final int memoryGB)
    {
        super(remainingMinutes, carrier);
        this.highResolutionCamera = highResolutionCamera;
        this.memoryGB = memoryGB;
    }

    public boolean highResolutionCameraGetter()
    {
        return highResolutionCamera;
    }

    public void highResolutionCameraMutator(final boolean highResolutionCamera)
    {
        this.highResolutionCamera = highResolutionCamera;
    }

    public int memoryGBGetter()
    {
        return memoryGB;
    }

    public void memoryGBMutator(final int memoryGB)
    {
        this.memoryGB = memoryGB;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "\nIPhone16 does" + (highResolutionCamera? " " : "not ") +
                "have high_resolution camera\n" +
                "Iphone16 has " + memoryGB + " gigabytes of memory";
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
        if (!(that instanceof IPhone16))
        {
            return false;
        }
        final IPhone16 device;
        device = (IPhone16)that;

        return ((this.remainingMinutesGetter() == device.remainingMinutesGetter()
                && (highResolutionCamera == device.highResolutionCameraGetter())));
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(this.remainingMinutesGetter());
    }
}
