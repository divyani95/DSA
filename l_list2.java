import java.util.Scanner;
class LinkedList {
    class Node {
        int data;
        Node next;

        Node() {
            data = 0;
            next = null;
        }
    }

    Node startptr = null;

    void insertBegin(int item) {
        Node newNode = new Node();
        newNode.data = item;
        newNode.next = startptr;
        startptr = newNode;
    }

    void insertMid(int item, int loc) {
        Node newNode = new Node();
        Node q = startptr;
        int i;

        for (i = 1; i < loc - 1; i++) {
            if (q == null) {
                System.out.println("The location is invalid");
                return;
            }
            q = q.next;
        }

        newNode.data = item;
        newNode.next = q.next;
        q.next = newNode;
    }

    void insertEnd(int item) {
        Node newNode = new Node();
        newNode.data = item;
        newNode.next = null;

        if (startptr == null) {
            startptr = newNode;
        } else {
            Node q = startptr;
            while (q.next != null) {
                q = q.next;
            }
            q.next = newNode;
        }
    }

    void displayList() {
        Node q = startptr;
        if (startptr == null) {
            System.out.println("List is empty");
        } else {
            while (q != null) {
                System.out.print(q.data + " ");
                q = q.next;
            }
            System.out.println();
        }
    }
}

public class l_list2 {
    public static void main(String args[]) {
        LinkedList l = new LinkedList();
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
                System.out.println("c. Insert in the middle");
                System.out.println("Enter your choice");
                c = sc.next().charAt(0);

                if (c == 'a') {
                    System.out.println("Enter a node");
                    int a = sc.nextInt();
                    l.insertBegin(a);
                }

                if (c == 'b') {
                    System.out.println("Enter a node");
                    int a = sc.nextInt();
                    l.insertEnd(a);
                }

                if (c == 'c') {
                    System.out.println("Enter a node");
                    int a = sc.nextInt();
                    System.out.println("Enter the location");
                    int loc = sc.nextInt();
                    l.insertMid(a, loc);
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
