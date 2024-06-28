package Stack;

public class NStack {
    private int[] arr;    
    private int[] top;  
    private int[] next;  
    private int free;  

    public NStack(int numStacks, int capacity) {
        arr = new int[capacity];
        top = new int[numStacks];
        next = new int[capacity];


        for (int i = 0; i < numStacks; i++) {
            top[i] = -1;
        }

        free = 0;
        for (int i = 0; i < capacity - 1; i++) {
            next[i] = i + 1;
        }
        next[capacity - 1] = -1; 
    }

    public void push(int stackNum, int value) {
        if (free == -1) {
            System.out.println("Stack Overflow");
            return;
        }

        int i = free; 

        free = next[i]; 

        next[i] = top[stackNum]; 
        top[stackNum] = i; 

        arr[i] = value; 
    }

    
    public int pop(int stackNum) {
        if (top[stackNum] == -1) {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }

        int i = top[stackNum];

        top[stackNum] = next[i]; 

        next[i] = free; 
        free = i;

        return arr[i]; 
    }

    
    public int peek(int stackNum) {
        if (top[stackNum] == -1) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }

        return arr[top[stackNum]];
    }

    public boolean isEmpty(int stackNum) {
        return top[stackNum] == -1;
    }
}
