import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;

public class MyArrayTest {
    @Test
    public void testDemo() throws IOException {
        MyArray str = new MyArray();
        assertEquals(str.getLength(), 4);
    }    
}