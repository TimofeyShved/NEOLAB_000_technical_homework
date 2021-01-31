import org.junit.Test;
import static org.junit.Assert.*;

public class myStringTest {
    @Test
    public void revertString() throws Exception {
        myString x = new myString();
        assertEquals(x.revertString("ultr53o?n"), "nortlu");
        assertEquals(x.revertString("grishan"), "nahsirg");
        assertEquals(x.revertString("zul53450-(^)tr53o?nA"), "Anortluz");
        assertEquals(x.revertString("ifajsdi(%*#()%4236___fsdf4234-"), "fdsfidsjafi");
        assertEquals(x.revertString("FGDOVB-345-FSD-4-5_F"), "FDSFBVODGF");
        assertEquals(x.revertString("ABCD-123,./nZ"), "ZnDCBA");
        assertEquals(x.revertString("**4324("), "");
    }
}
