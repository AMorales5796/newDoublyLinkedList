public class Driver extends DoublyLL
{
    public static void main(String args[])
    {
        DoublyLL dll = new DoublyLL();
        dll.push(2);
        dll.push(1);
        dll.pushAtEnd(4);
        dll.push(3);
        dll.pop(dll.tail);
       //dll.insertAfterGiven(1,4);//figure out how to refer to a specific node like an array list
        dll.showList();
        //System.out.println(dll.getTailData());
    }
}
