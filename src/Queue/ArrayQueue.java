package Queue;

public class ArrayQueue<E> implements Queue<E> {
    private E[] data;
    private int f=0;
    private int sz=0;


    public ArrayQueue(int capacity){
        data=(E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public boolean isEmpty() {
        return sz==0;
    }

    @Override
    public void enqueue(E e) throws IllegalStateException{
        if (sz== data.length) throw  new IllegalStateException("Queue is full");
        int avail=(f+sz)% data.length;
        data[avail]=e;
        sz++;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return data[f];
    }

    @Override
    public E dequeue() {
        if (isEmpty()) return null;
        E answer=data[f];
        data[f]=null;
        f=(f+1)% data.length;
        sz--;
        return answer;
    }
    public void view(){
        for(E data:data){
            System.out.println("|" + data+"|");
        }
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> queue=new ArrayQueue<Integer>(7);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.enqueue(0);
        queue.enqueue(2);
        queue.view();
        System.out.println("-----------------------");
        queue.dequeue();
        queue.dequeue();
        queue.view();

        System.out.println("-----------------------");
        queue.enqueue(4);
        queue.view();

    }
}
