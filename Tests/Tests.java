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
        assertEquals(3,dll.getTailData());
    }

    @Test
    public void testPushAtEnd2()
    {
        dll.push(2);
        dll.pushAtEnd(3);
        dll.push(1); //even after setting the tail to 3, I want to make sure that a push does not affect it
        dll.pushAtEnd(20);
        assertEquals(20,dll.getTailData());
    }

    @Test
    public void testPushAtEnd3()
    {
        dll.pushAtEnd(3);
        assertEquals(1,dll.findSize());
    }

    @Test
    public void testBlankDll()
    {
        dll.showList();
        assertEquals(0,dll.findSize());
    }

    @Test
    public void testPushMethod()
    {
        dll.push(1);
        assertEquals(1,dll.findSize());
    }

    @Test
    public void testPushMethod2()
    {
        dll.push(10);
        dll.push(20);
        dll.push(30);
        dll.push(40);
        dll.push(50);
        assertEquals(5,dll.findSize());
    }

    @Test
    public void testPushMethod3()
    {
        dll.push(10);
        dll.push(20);
        dll.push(30);
        assertEquals(3,dll.findSize());
    }

    @Test
    public void testPopMethod()
    {
        dll.push(10);
        dll.push(20);
        dll.push(30);
        dll.pop(dll.head,dll.head);
        assertEquals(2,dll.findSize());
    }

}
