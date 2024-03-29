
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front, rear;

    public Queue() {
        front = rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(data + " enqueued to the queue");
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int dequeuedValue = front.data;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
        return dequeuedValue;
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Elements of Queue:");
        Node current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

public class Queueimpl{
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();
        System.out.println("Dequeued element: " + queue.dequeue());
        queue.display();
    }
}































