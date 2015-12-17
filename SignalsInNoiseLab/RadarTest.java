
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RadarTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RadarTest
{
    /**
     * Default constructor for test class RadarTest
     */
    public RadarTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    @Test
    public void testRadarClass()
    {
        Radar testRadar = new Radar(100,100);
        testRadar.setMonsterLocation(50,50);
        testRadar.scan();
        //assertTrue(testRadar.isDeflected(60,60));
        assertEquals(testRadar.getNumScans(), 1);

        int count = 0;
        for( int i= 0; i < 100; i++)
        {
            testRadar.scan();
        }
        for( int i = 0; i < testRadar.getNumRows(); i++)
        {
            for( int j = 0; j < testRadar.getNumCols(); j++)
            {
                count += testRadar.getAccumulatedDetection(i,j);
            }
        }

        Radar testRadar2 = new Radar(200,200);
        testRadar2.setMonsterLocation(40,40);
        testRadar2.scan();
        //assertTrue(testRadar.isDeflected(30,30));
        assertEquals(testRadar2.getNumScans(), 1);

        int count2 = 0;
        for( int i = 0; i < testRadar.getNumRows(); i++)
        {
            for( int j = 0; j < testRadar.getNumCols(); j++)
            {
                count += testRadar.getAccumulatedDetection(i,j);
            }
        }
    }

}
