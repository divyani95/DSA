import java.util.Scanner;

class c_queue {
    int front, rear, n;

    int q[] ;

    c_queue(int size) {
        front = -1;
        rear = -1;
        q = new int[size];
        n = size;
    }

    void insert_queue(int item) {
        if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
            q[rear] = item;
            System.out.println("Inserted " + q[rear] + " at index " + rear);
        }
        else {
            rear = (rear + 1) % n;
            
            if (rear == front) {
                rear = n-1;
                System.out.println("INSERT UNSUCCESSFUL: Circular queue is full");
            }
            else{
                q[rear] = item;
                System.out.println("Inserted " + q[rear] + " at index " + rear);
            }
        }
    }

    void print_queue() {
        System.out.println("\nThe Queue is: ");
        for (int i = front; i <= rear; i++) {
            System.out.println(q[i]);
        }
    }

    void delete_queue() {
        System.out.println("Deleted " + q[front] + " from index " + front);
        front = front + 1;
    }
}



class Circular_queue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the size of circular queue: ");
        int size = sc.nextInt();
        c_queue cq = new c_queue(size);
        
        int ch = -1;
      

        while (ch != 0) {
            System.out.println("\nCIRCULAR QUEUE: Make a choice");
            System.out.println("1. Insert into the queue");
            System.out.println("2. Print the circular queue");
            System.out.print("3. Delete from queue");
            System.out.print("\nMake your choice: ");
            ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("\nEnter an element to insert: ");
                int item = sc.nextInt();

                cq.insert_queue(item);
            }
            else if (ch == 2) {
                cq.print_queue();
            }
            else if (ch == 3) {
                cq.delete_queue();
            }
            else {
                System.out.println("\nInvalid input!");
            }
        }
    }    
}