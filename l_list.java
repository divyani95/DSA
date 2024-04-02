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
        if (startptr == null) {
            newNode.data = item;
            newNode.next = null;
            startptr = newNode;
        } else {
            newNode.data = item;
            newNode.next = startptr;
            startptr = newNode;
        }
    }
void insertMid(int item, int loc){
       Node  newNode=newNode();
       Node q = strPtr;
      int i;
     for(i=1;i<loc-1;i++){
     if(q==null){
   System.out.println("The location is invalid");
    return;
}
q = q.next;
}
newNode.data= item;
newNode.next=q.next;
if(q!=null){
 q.next = newNode;
}
else{
   strtptr = newNode;
    }
}
void deleteBegin(){
    if(strtptr!=null){
   strtPtr = strtPtr.next
    void insertEnd(int item) {
        Node newNode = new Node();
        Node q = startptr;
        while (q.next != null) {
            q = q.next;
        }
        newNode.data = item;
        newNode.next = null;
        q.next = newNode;
    }
 void deleteMid(int item) {
        Node save = null;
        Node q = strPtr;
        while (q != null) {
            if (q.data != item) {
                save = q;
                q = q.next;
            } else {
                if (save != null) {
                    save.next = q.next;
                } else {
                    strPtr = q.next; // Update strPtr if the deletion is at the beginning
                }
                return;
            }
        }
    }

    void deleteEnd() {
        if (strPtr == null) {
            return;
        }
        Node q = strPtr;
        Node save = null;
        while (q.next != null) {
            save = q;
            q = q.next;
        }
        if (save != null) {
            save.next = null;
        } else {
            strPtr = null; // Update strPtr if the deletion is at the beginning
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
 public class l_list
 {
    public static void main(String args[]) 
{
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
