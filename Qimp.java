import java.util.Scanner;

class Que {          
    int rear, front, n;
    int q[];

    Que(int size) {
        q = new int[size];
        n = size;
        rear = -1;
        front = -1;
    }

    void insert(int item) {
        if (rear == n - 1) {
            System.out.println("Overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = rear + 1;
            q[rear] = item;
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(q[i]);
            }
        }
    }
	void delete() {
    if (front == -1 || front > rear) {
        System.out.println("Underflow");
    } else {
        front = front + 1;
        System.out.println("Element deleted from the queue");
    }
}
}


class Qimp {
    public static void main(String args[]) {
        Que ob = new Que(5);
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        while (ch != 4) {
            System.out.println("1 insert an element in Q");
            System.out.println("2 display");
			System.out.println("3 delete");
			
            System.out.println("4 exit");
            System.out.println("enter your choice");
            ch = sc.nextInt();
            if (ch == 1) {
                int a;
                System.out.println("enter an element");
                a = sc.nextInt();
                ob.insert(a);
            }
            if (ch == 2) {
                System.out.println("elements of the Q");
                ob.display();
            }
			if (ch == 3) {
                System.out.println("delete of the Q");
                ob.delete();
            }
			
			
			
            if (ch == 4) {
                break;
            }
        }
    }
}