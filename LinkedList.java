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

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;

        } else if (size == 1) {
            int val = head.data;

            head = tail = null;
            size = 0;
            return val;
        }
        // prev = i = size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;

        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int iterativeSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    public int helper(Node head, int key) {
        // Base Case
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    // Reverse in Linked List
    public void reverseLL() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            // step 1
            next = curr.next;
            // step 2
            curr.next = prev;
            // Step 3
            prev = curr;
            // step4
            curr = next;
        }
        head = prev;
    }

    // Find the nth and node and delete it from the Linked List
    public void deleteNthFromEnd(int n) {
        // calculate the size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;

        }
        // int n = 0;
        if (n == size) {
            head = head.next; // remove first
            return;
        }

        // size -n th
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;

        }

        prev.next = prev.next.next;

        return;

    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2

        }
        return slow; // slow is my midnode
    }

    public boolean checkPalindrome() {
        // base case
        if (head == null || head.next == null) {
            return true;
        }

        // step 1 : find mid node
        Node midNode = findMid(head);

        // step 2 : reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Node right = prev;
        Node left = head;
        // step 3: check if 1st half == 2nd half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);

        ll.addFirst(1);

        ll.addLast(2);

        ll.addLast(5);
        ll.addMiddle(2, 3);
        ll.print();
        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // System.out.println(ll.recursiveSearch(3));
        // ll.reverseLL();
        // ll.deleteNthFromEnd(1);
        System.out.println(ll.checkPalindrome());
        // ll.print();

    }
}
