public class Main {

    public static void main(String[] args) {

        Stack<Integer> theStack = new ArrayStack<Integer>(10);
        for(int i=0; i<10; i++) {
            theStack.push(i);
        }

        for(int i=20; i<31; i++) {
            theStack.push(i);
        }

        for(int i=0; i<16; i++) {
            System.out.println(theStack.pop());
        }
    }

}
