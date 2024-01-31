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

    void deleteBegin() {
        if (startptr != null) {
            startptr = startptr.next;
        }
    }

    void deleteEnd() {
        if (startptr == null) {
            return;
        }
        Node q = startptr;
        Node save = null;
        while (q.next != null) {
            save = q;
            q = q.next;
        }
        if (save != null) {
            save.next = null;
        } else {
            startptr = null; // Update startptr if the deletion is at the beginning
        }
    }

    void deleteMid(int item) {
        Node save = null;
        Node q = startptr;
        while (q != null) {
            if (q.data != item) {
                save = q;
                q = q.next;
            } else {
                if (save != null) {
                    save.next = q.next;
                } else {
                    startptr = q.next; // Update startptr if the deletion is at the beginning
                }
                return;
            }
        }
    }
}

public class l_list_delete {
    public static void main(String args[]) {
        LinkedList l = new LinkedList();
        int ch = 0;
        char c = ' ';
        Scanner sc = new Scanner(System.in);

        while (ch != 4) {
            System.out.println("1. Insert a node");
            System.out.println("2. Display the list");
            System.out.println("3. Delete element from the list");
            System.out.println("4. Exit");
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
                System.out.println("a delete an element at the beginning");
                System.out.println("b delete an element at the end");
                System.out.println("c delete an element in the middle");
                System.out.println("Enter your choice");
                c = sc.next().charAt(0);
                if (c == 'a') {
                    System.out.println("element deleted at beginning");
                    l.deleteBegin();
                } else if (c == 'b') {
                    System.out.println("element deleted at end");
                    l.deleteEnd();
                } else if (c == 'c') {
                    System.out.println("Enter the element to delete");
                    int a = sc.nextInt();
                    l.deleteMid(a);
                }
            }

            if (ch == 4) {
                break;
            }
        }
    }
}
