package Stack;

public class NStackTest {
    public static void main(String[] args) {
        int numStacks = 3;
        int capacity = 10;
        NStack ns = new NStack(numStacks, capacity);

        ns.push(0, 15);
        ns.push(1, 45);
        ns.push(2, 17);
        ns.push(2, 49);
        ns.push(0, 11);
        ns.push(0, 9);

        System.out.println("Popped element from stack 2 is " + ns.pop(2));
        System.out.println("Popped element from stack 1 is " + ns.pop(1));
        System.out.println("Popped element from stack 0 is " + ns.pop(0));
    }
}
