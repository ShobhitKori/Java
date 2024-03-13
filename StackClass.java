import java.util.Stack;
public class StackClass {
    // static class Node {
    //     int data;
    //     Node next;
    //     public Node(int data) {
    //         this.data = data;
    //         next = null;
    //     }
    // }
    // static class Stack {
    //     public static Node head;
    //     public boolean isEmpty() {
    //         return head == null;
    //     }
    //     public void push(int data) {
    //         Node newNode = new Node(data);
    //         if(isEmpty()) {
    //             head = newNode;
    //             return;
    //         }
    //         newNode.next = head;
    //         head = newNode;
    //     }
    //     public int pop() {
    //         if(isEmpty()) {
    //             return -1;
    //         }
    //         int top = head.data;
    //         head = head.next;
    //         return top;
    //     }
    //     public int peek(){
    //         if(isEmpty()) {
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }
    public static void pushAtBottom(int data, Stack<Integer> stack) {
        if(stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(data, stack);
        stack.push(top);
    }
    public static void reverse(Stack<Integer> stack) {
        if(stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        reverse(stack);
        pushAtBottom(top, stack);
    }
    public static void main(String agrs[]) {
        // Stack stack = new Stack();
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // pushAtBottom(4, stack);
        reverse(stack);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}