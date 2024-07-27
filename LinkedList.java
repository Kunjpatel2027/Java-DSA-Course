public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Methods to perform Operations in Linked List
    public void addFirst(int data) {
        // step 1 : Create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2: newNode's next = head
        newNode.next = head;// link
        // Step 3 : head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        // Step 1: Create a newNode
        Node newNode2 = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode2;
        }
        // Step 2: tail's next=newNode
        tail.next = newNode2;
        // Step 3 : tail=newNode;
        tail = newNode2;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int idx, int data) {
        // special case
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i=idx-1 temp-> previous
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);

        ll.addFirst(1);

        ll.addLast(3);

        ll.addLast(4);
        ll.addMiddle(2, 9);
        ll.print();
        // System.out.println(ll.size);
        ll.removeFirst();
        ll.print();

    }
}
