package Stack;

public class ArrayStack<E> implements Stack<E>{
    public static final int CAPACITY=10;
    private E[] data;
    private int t=-1;
    public ArrayStack(){this(CAPACITY);}
    public ArrayStack(int capacity){
        data=(E[]) new Object[capacity];
    }
    @Override
    public int size() {
        return (t+1);
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public E top() {
        if (isEmpty())return null;
        return data[t];
    }

    @Override
    public void push(E e) throws IllegalStateException{
        if (size()==data.length) throw new IllegalStateException("Stack is full");
        data[++t]=e;
    }

    @Override
    public E pop() {
        if (isEmpty()) return null;
        E answer=data[t];
        data[t]=null;
        t--;
        return answer;
    }
    public void trasverse(){
        for (int i=data.length-1; i>=0; i--){
            if (data[i]!=null) {
                System.out.println("|" + data[i]+"|");
            }

        }
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        ArrayStack<Integer> stack=new ArrayStack<Integer>();
        stack.push(3);
        stack.push(4);
        stack.push(1);
        stack.push(7);
        stack.trasverse();
        stack.pop();
        stack.pop();
        stack.trasverse();
    }
}
