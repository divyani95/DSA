

import java.util.Stack;
class QueueUsingStacks {
    private Stack<Integer> stack1; // For enqueue operation
    private Stack<Integer> stack2; // For dequeue operation

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation: O(1) time complexity
    public void enqueue(int item) {
        stack1.push(item);
    }

    // Dequeue operation: O(n) time complexity in the worst case, but amortized O(1)
    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");

        // If the dequeue stack is empty, transfer elements from enqueue stack
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    // Peek operation: O(n) time complexity in the worst case, but amortized O(1)
    public int peek() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");

        // If the dequeue stack is empty, transfer elements from enqueue stack
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        
        System.out.println("Dequeued: " + queue.dequeue()); // Dequeue 1
        System.out.println("Dequeued: " + queue.dequeue()); // Dequeue 2
        
        queue.enqueue(4);
        
        System.out.println("Peek: " + queue.peek()); // Peek 3
        System.out.println("Dequeued: " + queue.dequeue()); // Dequeue 3
        System.out.println("Dequeued: " + queue.dequeue()); // Dequeue 4
        
        // Trying to dequeue from an empty queue should throw an exception
        // System.out.println("Dequeued: " + queue.dequeue()); // Throws IllegalStateException
    }
}












