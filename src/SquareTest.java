import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.beans.Transient;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class SquareTest {
    @Test
    public void test1(){
        assertEquals(4, Square.square(2));
    }
    @Test
    public void test2(){
        assertEquals(81, Square.square(9));
    }
    @Test
    public void test3(){
        assertNotEquals(1, Square.square(0));
    } 
}
