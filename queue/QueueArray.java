package queue;

public class QueueArray {
	private int[] arr;
    private int front, rear;
    private int maxSize;

    public QueueArray(int size) {
        arr = new int[size];
        front = -1;
        rear = -1;
        maxSize = size;
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int value) {
    	if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        if (front == -1) front = 0;
        rear++;
        arr[rear] = value;
        System.out.println("Enqueued: " + value);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int dequeuedValue = arr[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        return dequeuedValue;
    }
}
