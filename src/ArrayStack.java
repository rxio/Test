public class ArrayStack<E> implements Stack<E> {

    public E[] arr;
    private int counter = 0;
    private int capacity;

    public ArrayStack(int capacity){
        this.capacity = capacity;
        arr = (E[]) new Object[this.capacity];
    }
    public void push(E element){
        if(isFull()) {
            resize();
        }
        arr[counter++] = element;
    }

    public E pop(){
        E saved = arr[--counter];
        arr[counter] = null;
        return saved;
    }

    public boolean isEmpty(){
        return counter == 0;
    }

    public boolean isFull() {
        return counter == arr.length;
    }

    public E peek() {
        return arr[counter-1];
    }

    public void resize() {
        capacity *= 2;
        E[] tmp = (E[]) new Object[capacity];
        for(int i=0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }

        arr = tmp;
    }
}
