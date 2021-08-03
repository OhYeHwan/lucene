import org.junit.Test;

import static org.junit.Assert.*;

public class JUnitTestTest {

    @Test
    public void add() {
       JUnitTest j = new JUnitTest();
       assertEquals(j.add(1,2), 3);
    }
}