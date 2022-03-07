public class DoublyLL
{
    public int data;
    private Node head;
    private Node tail;

    public int getTailData()
    {
        return tail.getData();
    }

    public DoublyLL()
    {
        Node headNode = null;
        Node tailNode = null;
    }//public default constructor for doubly linked list

    /*
    public int sizeofList(DoublyLL newLL)
    {
        int size = 0;
        int newData = this.data;
        Node newDLLNode = new Node(newData);
        Node headNode = head;
        while (headNode.next != null)
        {
            size++;
            newDLLNode = newDLLNode.next;
        }//end of while
        return size;
    }//end of sizeofList method
    */

    public int findSize()
    {
        Node current = head; //start off with the head of the list
        int size = 0; //create a counter int variable
        while (current != null)
        {
            size++;
            current = current.next; //moves on to the next node
        }//end of while loop
        return size;
    }//end of findSize method

    public void showList()
    {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }//list null validation

        Node current = head; //start off with the head of the list
        while (current != null) //run below if the node is not the tail; it's not null
        {
            System.out.println(current.data); //prints out the data of the current node
            current = current.next; //moves on to the next node
        }//end of while loop
        
    }//end of showList method


    //INSERTIONS METHODS
    public void push(int newData)
    {
        //pushing is the insertion method that inserts a new head node

        Node newDLLNode = new Node(newData); //first create the new temp node

        newDLLNode.setPrev(null); //previous pointer is null; that's what makes it the head
        newDLLNode.setNext(head); //next pointer is linked as head

        if (head != null)
            head.prev = newDLLNode; //links the previous head node's prev to the new head node

        head = newDLLNode; //finally assign the whole new node as the head node
    }//end of push method (IT WORKSSSSS!!!)

    public void pushAtEnd(int newData)
    {
        //pushing is the insertion method that inserts a new head node
        Node newDLLNode = new Node(newData); //first create the new temp node

        newDLLNode.setPrev(tail); //previous pointer is null; that's what makes it the head
        newDLLNode.setNext(null); //next pointer is linked as head

        if (tail != null)
        {
            tail.next = newDLLNode; //links the previous head node's prev to the new head node
        }

        tail = newDLLNode; //finally assign the whole new node as the head node
    }//end of pushAtEnd method

    public Node findGiven(int position)
    {
        Node current  = head; //start off with the head of the list
        for (int i = 0; i < position; i++) //run below if the node is not the tail; it's not null
        {
            current = current.getNext(); //moves on to the next node
        }//end of while
        return current;
    }//end of findGiven (this is for insertAfterGiven Method)

    public void insertAfterGiven(int position, int newData)
    {
        if(findGiven(position).prev == null)
        {
            System.out.println("The previous node is null");
            return;
        }//null validation

        Node newDLLNode = new Node(newData); //create the new temp node

        newDLLNode.next = findGiven(position).next;

        findGiven(position).next = newDLLNode;

        newDLLNode.prev = findGiven(position);

        Node newNextNode = newDLLNode.next;

        if(newDLLNode != null)
        {
            newNextNode.prev = newDLLNode;
        }
    }//end of insertAfterGiven method

    /*
     * At the end,
     * Create a temp node
     * setPrev to tail
     * setNext to null
     * if tail != null then set tail's next to newNode
     * tail = newNode*/
    /*
    public void addAtTheEnd(Node nextNode, int )
    {
        if(prevNode == null)
        {
            System.out.println("The previous node is null");
            return;
        }//null validation
    }*/

/*
Insertion
A node can be added in four ways
1) At the front of the DLL
2) After a given node.
3) At the end of the DLL
4) Before a given node.
Remove
1) Pop - remove from front
Peak
1) Pop then push
*/

    private class Node
    {
        //instance variables
        private int data;
        private Node prev; //instance of a self-referencing class
        private Node next;

        //constructors
        public Node (int data)
        {
            this.data = data;
        }

        //getters
        public int getData()
        {
            return data;
        }

        public Node getPrev()
        {
            return prev;
        }

        public Node getNext()
        {
            return next;
        }


        //setters
        public void setData(int data) {
            this.data = data;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        //toStrings
        public String prevToString()
        {
            return "data: " + data + " links to " + prev;
        }

        public String nextToString()
        {
            return "data: " + data + " links to " + next;
        }
    }//end of class Node
}//end of main class DoublyLL