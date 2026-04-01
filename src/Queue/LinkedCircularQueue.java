package Queue;

import Linked_List.Theory.CircularyLinkedList;



public class LinkedCircularQueue<E> implements CircularQueue<E>{
    LinkedQueue<E> queue=new LinkedQueue<E>();
    @Override
    public void rotate() {
        if (isEmpty() || queue.size()==1){ return;}
        queue.enqueue(queue.dequeue());
        queue.wacht();
        System.out.println("");
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        queue.enqueue(e);
    }

    @Override
    public E first() {
        return queue.first();
    }

    @Override
    public E dequeue() {
        return queue.dequeue();
    }
    public void traverse(){
        queue.wacht();
        System.out.println("");
    }

    public static void main(String[] args) {
        LinkedCircularQueue<Integer> queue=new LinkedCircularQueue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.traverse();
        for (int i=0;i<12;i++){
        queue.rotate();
        }
        queue.dequeue();
        queue.traverse();
    }
}
