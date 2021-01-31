import org.junit.Test;
import static org.junit.Assert.*;

public class RomeNumTest {
    @Test
    public void getRomeNum() throws Exception {
        RomeNum x = new RomeNum();
        assertEquals(x.getRomeNum(49), "XLIX");
        assertEquals(x.getRomeNum(50), "L");
        assertEquals(x.getRomeNum(39), "XXXIX");
        assertEquals(x.getRomeNum(23), "XXIII");
        assertEquals(x.getRomeNum(2020), "MMXX");
        assertEquals(x.getRomeNum(757), "DCCLVII");
        assertEquals(x.getRomeNum(999), "CMXCIX");
    }
}
