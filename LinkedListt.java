class LinkedListt {
    Node head;
    private int size;
    LinkedListt() {
        size = 0;
    }
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        if(head == null) {
            System.out.println("List does not exist!");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void remove() {
        if(head == null) {
            System.out.println("List does not exist!");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        while(currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
    }
    
    public void removeFirst() {
        if(head == null) {
            System.out.println("List does not exist!");
            return;
        }
        size--;
        head = head.next;
    }
    public int getsize() {
        return size;
    }
    public void reverseIterative() {
        if(head == null || head.next == null) {
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            //update
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    }

    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public void removeNthFromLast(int n) {
        if(head == null) {
            return;
        }
        // int size = 0;
        // Node curr = head;
        // while(curr != null) {
        //     size++;
        //     curr = curr.next;
        // }
        int idxToSearch = getsize() - n;
        int i = 1;
        Node prev = head;
        while(i < idxToSearch) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }
    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public Node findMiddle() {
        Node hare = head;
        Node tortoise = head;
        while(hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;
        }
        return tortoise;
    }
    public boolean isPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }

        Node firstHalfStart = head;
        Node middle = findMiddle();
        Node secondHalfStart = reverse(middle.next);

        while(secondHalfStart != null) {
            if(firstHalfStart.data != secondHalfStart.data) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }
    public static void main(String[] args) {
        // LinkedListt linkedListt = new LinkedListt();
        // linkedListt.addFirst("data1");
        // linkedListt.printList();
        // System.out.println(linkedListt.getsize());

        // linkedListt.addLast("data2");
        // linkedListt.printList();
        // System.out.println(linkedListt.getsize());

        // linkedListt.addFirst("data0");
        // linkedListt.printList();
        // System.out.println(linkedListt.getsize());

        // linkedListt.addLast("data3");
        // linkedListt.printList();
        // System.out.println(linkedListt.getsize());

        // linkedListt.remove();
        // linkedListt.printList();
        // System.out.println(linkedListt.getsize());

        // linkedListt.removeFirst();
        // linkedListt.printList();
        // System.out.println(linkedListt.getsize());

    
        LinkedListt list = new LinkedListt();

        list.addLast(0);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        list.addLast(0);
        list.printList();

        // list.removeNthFromLast(5);
        // list.printList();

        System.out.println(list.isPalindrome());
        // list.reverseIterative();
        // list.printList();
        
        // list.head = list.reverseRecursive(list.head);
        // list.printList();

    }
}