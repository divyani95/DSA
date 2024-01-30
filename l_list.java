import java.util.Scanner;

class linked_list {
    class node {
        int data;
        node next;

        node() {
            data = 0;
            next = null;
        }
    }

    node startptr = null;

    void insert_begin(int item) {
        node newNode = new node();
        if (startptr == null) {
            newNode.data = item;
            newNode.next = null;
            startptr = newNode;
        } else {
            newNode.data = item;
            newNode.next = startptr;
        }
    }

    void insert_end(int item) {
        node newNode = new node();
        node q = startptr;
        while (q.next != null) {
            q = q.next;
        }
        newNode.data = item;
        newNode.next = null;
        q.next = newNode;
    }

    void display_list() {
        node q = startptr;
        if (startptr == null) {
            System.out.println("List is empty");
        } else {
            while (q != null) {
                System.out.print(q.data + " ,");
                q = q.next;
            }
            System.out.println();  // To move to the next line after printing the list
        }
    }
}

public class l_list {
    public static void main(String args[]) {
        linked_list l = new linked_list();
        int ch = 0;
        char c = ' ';  // Initialize 'c' to avoid compilation errors
        Scanner sc = new Scanner(System.in);

        while (ch != 3) {
            System.out.println("1.Insert a node");
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
                l.display_list();
            }

            if (ch == 3) {
                break;
            }
        }
    }
}
