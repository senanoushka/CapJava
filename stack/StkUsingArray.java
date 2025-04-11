package stack;
import java.util.*;

public class StkUsingArray {
	int size = 10000;
    int arr[] = new int[size];
    int top = -1;
    void push(int x) {
        top++;
        arr[top] = x;
    }
    int pop() {
        int x = arr[top];
        top--;
        return x;
    }
    int top() {
        return arr[top];
    }
    int size() {
        return top + 1;
    }
    boolean isEmpty() {
    	return (size==-1);
    }
    void display() {
    	System.out.println("Stack is: ");
    	for (int i=top; i>=0; i--) System.out.println(arr[i]+" ");
    }
    
}

