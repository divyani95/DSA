class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        Node prev = null;

        // If head is to be deleted
        if (current.data == data) {
            while (current.next != head) {
                current = current.next;
            }
            current.next = head.next;
            head = head.next;
        } else {
            do {
                prev = current;
                current = current.next;
            } while (current != head && current.data != data);

            if (current == head) {
                System.out.println("Element not found in the list");
                return;
            }

            prev.next = current.next;
        }
    }
}

public class Circularlinkedlist {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Circular Linked List:");
        list.display();

        System.out.println("Deleting 3:");
        list.delete(3);
        list.display();

        System.out.println("Deleting 1:");
        list.delete(1);
        list.display();

      System.out.println("Deleting 5:");
        list.delete(5);
        list.display();
    }
}





 

