import java.util.Scanner;

public class DoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node pre;

        Node() {
            data = 0;
            next = null;
            pre = null;
        }
    }

    Node strptr = null;

    void insert_begin(int item) {
        Node newnode = new Node();
        newnode.data = item;
        newnode.next = strptr;
        if (strptr != null) {
            strptr.pre = newnode;
        }
        strptr = newnode;
    }

    void insert_mid(int item, int loc) {
        Node newnode = new Node();
        Node q = strptr;
        for (int i = 1; i <= loc - 1; i++) {
            if (q == null) {
                System.out.println("Location not found");
                return;
            }
            q = q.next;
        }
        newnode.data = item;
        newnode.next = q.next;
        q.next = newnode;
        newnode.pre = q;
        if (newnode.next != null) {
            newnode.next.pre = newnode;
        }
    }

    void insert_end(int item) {
        Node newNode = new Node();
        newNode.data = item;
        newNode.next = null;
        if (strptr == null) {
            newNode.pre = null;
            strptr = newNode;
            return;
        }
        Node q = strptr;
        while (q.next != null) {
            q = q.next;
        }
        q.next = newNode;
        newNode.pre = q;
    }

    void displayList() {
        Node q = strptr;
        if (strptr == null) {
            System.out.println("List is empty");
        } else {
            while (q != null) {
                System.out.print(q.data + " ");
                q = q.next;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        DoublyLinkedList l = new DoublyLinkedList();
        int ch = 0;
        char c = ' ';
        Scanner sc = new Scanner(System.in);

        while (ch != 3) {
            System.out.println("1. Insert a node");
            System.out.println("2. Display the list");
            System.out.println("3. Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();

            if (ch == 1) {
                System.out.println("a. Insert in the beginning");
                System.out.println("b. Insert in the end");
                System.out.println("Enter your choice");
                c = sc.next().charAt(0);

                if (c == 'a') {
                    System.out.println("Enter a node");
                    int a = sc.nextInt();
                    l.insert_begin(a);
                }

                if (c == 'b') {
                    System.out.println("Enter a node");
                    int a = sc.nextInt();
                    l.insert_end(a);
                }
            }

            if (ch == 2) {
                System.out.println("The elements of the list are");
                l.displayList();
            }

            if (ch == 3) {
                break;
            }
        }
    }
}
