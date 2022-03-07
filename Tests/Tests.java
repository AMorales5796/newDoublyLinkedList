import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests
{
    private DoublyLL dll = new DoublyLL();

    @Test
    public void setDll()
    {
        dll = new DoublyLL();
    }

    @Test
    public void testPushAtEnd()
    {
        dll.push(2);
        dll.pushAtEnd(3);
        dll.push(1); //even after setting the tail to 3, I want to make sure that a push does not affect it
        assertEquals(dll.getTailData(),3);
    }

    @Test
    public void testPushMethod()
    {
        dll.push(1);
        assertEquals(1,dll.findSize());
    }//this is incorrect

    @Test
    public void sizeofList()
    { }
}
