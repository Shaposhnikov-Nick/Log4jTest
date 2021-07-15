import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    private Main main;

    @Test
    public void getSumTest(){
        assertEquals(14, main.getSum(7,7));
    }

    @Test
    public void getSubTest(){
        assertEquals(25, main.getSub(65,40));
    }

    @Test
    public void getDivideTest(){
        assertEquals(8, main.getDivide(56,7));
    }

    @Test(expected = ArithmeticException.class)
    public void getDivByZeroTest(){
         main.getDivide(7,0);
    }

    @Test
    public void getMultiplTest(){
        assertEquals(35, main.getMultipl(5,7));
    }

    @Before
    public void initTest(){
        Main main = new Main();
    }

    @After
    public void afterTest(){
        main = null;
    }
}

