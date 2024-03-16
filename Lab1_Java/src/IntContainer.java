public class IntContainer
{
    private class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public IntContainer()
    {
        head = null;
        tail = null;
        size = 0;
    }

    public void addToEnd(int element)
    {
        Node newNode = new Node(element);
        if (tail == null)
        {
            head = newNode;
        }
        else
        {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public void addToStart(int element)
    {
        Node newNode = new Node(element);
        if (head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public int getByIndex(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        Node current = head;
        for (int i = 0; i < index; i++)
        {
            current = current.next;
        }
        return current.data;
    }

    public void removeFromEnd()
    {
        if (size == 0)
        {
            throw new IllegalStateException("Container is empty");
        }
        if (size == 1)
        {
            head = null;
            tail = null;
        }
        else
        {
            Node current = head;
            while (current.next != tail)
            {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
        size--;
    }

    public void removeFromStart()
    {
        if (size == 0)
        {
            throw new IllegalStateException("Container is empty");
        }
        if (size == 1)
        {
            head = null;
            tail = null;
        }
        else
        {
            head = head.next;
        }
        size--;
    }

    public void removeAll()
    {
        head = null;
        tail = null;
        size = 0;
    }

    public void printAllElements()
    {
        Node current = head;
        System.out.print("Элементы контейнера: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int size()
    {
        return size;
    }
}