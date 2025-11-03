package ca.bcit.comp2522.lab3;

/**
 * Drives equality tests for IPod, IPad, IPhone, and IPhone16 objects.
 * Creates sample instances and prints whether equals() behaves as expected.
 *
 * @author Arshia Adamian
 * @author Rodrick Vizigro
 * @author Indy Grewal
 * @author Abdullah Alasmy
 * @version 1.0
 */
public final class Main
{
    private static final int IPOD1_SONGS = 300;
    private static final int IPOD2_SONGS = 400;
    private static final int IPOD3_SONGS = 300;

    private static final double IPOD1_VOLUME_DB = 80.0;
    private static final double IPOD2_VOLUME_DB = 85.0;
    private static final double IPOD3_VOLUME_DB = 70.0;

    private static final boolean IPAD1_HAS_CASE = true;
    private static final boolean IPAD2_HAS_CASE = false;
    private static final boolean IPAD3_HAS_CASE = true;

    private static final String IPAD1_OS = "iPadOS 15";
    private static final String IPAD2_OS = "iPadOS 14";
    private static final String IPAD3_OS = "iPadOS 15";

    private static final double IPHONE1_MINUTES = 120.0;
    private static final double IPHONE2_MINUTES = 180.0;
    private static final double IPHONE3_MINUTES = 120.0;

    private static final String CARRIER_VERIZON = "Verizon";
    private static final String CARRIER_TMOBILE = "T-Mobile";
    private static final String CARRIER_ATT = "AT&T";

    private static final double IPHONE16_MINUTES = 100.0;
    private static final boolean HIGH_RESOLUTION_CAMERA = true;
    private static final boolean NO_HIGH_RESOLUTION_CAMERA = false;
    private static final int STORAGE_256_GB = 256;
    private static final int STORAGE_512_GB = 512;

    /**
     * Entry point for the program. Instantiates sample devices and exercises equals().
     *
     * @param args command-line arguments (unused)
     */
    public static void main(final String[] args)
    {
        final IPod ipod1;
        final IPod ipod2;
        final IPod ipod3;

        ipod1 = new IPod(IPOD1_SONGS, IPOD1_VOLUME_DB);
        ipod2 = new IPod(IPOD2_SONGS, IPOD2_VOLUME_DB);
        ipod3 = new IPod(IPOD3_SONGS, IPOD3_VOLUME_DB);

        System.out.println("IPod Equality Test:");
        if (!ipod1.equals(ipod2))
        {
            System.out.println("CORRECT: ipod1 is not equal to ipod2");
        }
        else
        {
            System.out.println("INCORRECT: ipod1 should not be equal to ipod2");
        }

        if (ipod1.equals(ipod3))
        {
            System.out.println("CORRECT: ipod1 is equal to ipod3");
        }
        else
        {
            System.out.println("INCORRECT: ipod1 should be equal to ipod3");
        }

        System.out.println();

        final IPad ipad1;
        final IPad ipad2;
        final IPad ipad3;

        ipad1 = new IPad(IPAD1_HAS_CASE, IPAD1_OS);
        ipad2 = new IPad(IPAD2_HAS_CASE, IPAD2_OS);
        ipad3 = new IPad(IPAD3_HAS_CASE, IPAD3_OS);

        System.out.println("IPad Equality Test:");
        if (!ipad1.equals(ipad2))
        {
            System.out.println("CORRECT: ipad1 is not equal to ipad2");
        }
        else
        {
            System.out.println("INCORRECT: ipad1 should not be equal to ipad2");
        }

        if (ipad1.equals(ipad3))
        {
            System.out.println("CORRECT: ipad1 is equal to ipad3");
        }
        else
        {
            System.out.println("INCORRECT: ipad1 should be equal to ipad3");
        }

        System.out.println();

        final IPhone iphone1;
        final IPhone iphone2;
        final IPhone iphone3;

        iphone1 = new IPhone(IPHONE1_MINUTES, CARRIER_VERIZON);
        iphone2 = new IPhone(IPHONE2_MINUTES, CARRIER_TMOBILE);
        iphone3 = new IPhone(IPHONE3_MINUTES, CARRIER_ATT);

        System.out.println("IPhone Equality Test:");
        if (!iphone1.equals(iphone2))
        {
            System.out.println("CORRECT: iphone1 is not equal to iphone2");
        }
        else
        {
            System.out.println("INCORRECT: iphone1 should not be equal to iphone2");
        }

        if (iphone1.equals(iphone3))
        {
            System.out.println("CORRECT: iphone1 is equal to iphone3");
        }
        else
        {
            System.out.println("INCORRECT: iphone1 should be equal to iphone3");
        }

        System.out.println();

        final IPhone16 iphone16_1;
        final IPhone16 iphone16_2;
        final IPhone16 iphone16_3;

        iphone16_1 = new IPhone16(IPHONE16_MINUTES, CARRIER_VERIZON,
                HIGH_RESOLUTION_CAMERA, STORAGE_512_GB);
        iphone16_2 = new IPhone16(IPHONE16_MINUTES, CARRIER_VERIZON,
                HIGH_RESOLUTION_CAMERA, STORAGE_256_GB);
        iphone16_3 = new IPhone16(IPHONE16_MINUTES, CARRIER_VERIZON,
                NO_HIGH_RESOLUTION_CAMERA, STORAGE_512_GB);

        System.out.println("IPhone16 Equality Test:");
        if (iphone16_1.equals(iphone16_2))
        {
            System.out.println("CORRECT: iphone16_1 is equal to iphone16_2");
        }
        else
        {
            System.out.println("INCORRECT: iphone16_1 should be equal to iphone16_2");
        }

        if (!iphone16_1.equals(iphone16_3))
        {
            System.out.println("CORRECT: iphone16_1 is not equal to iphone16_3");
        }
        else
        {
            System.out.println("INCORRECT: iphone16_1 should not be equal to iphone16_3");
        }

        System.out.println();
    }
}
