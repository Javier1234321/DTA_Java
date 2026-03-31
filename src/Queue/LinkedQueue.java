package Queue;

import Linked_List.Theory.SinglyLinkedList;

public class LinkedQueue<E> implements Queue<E>{
    private SinglyLinkedList<E> list=new SinglyLinkedList<>();
    public LinkedQueue(){};

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        list.addLast(e);
    }

    @Override
    public E first() {
        return list.first();
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }
    public void wacht(){
        list.traverseList();
    }

    public static void main(String[] args) {
        LinkedQueue<Integer> queue=new LinkedQueue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.wacht();
        System.out.println();
        queue.dequeue();
        queue.dequeue();
        queue.wacht();
        System.out.println();
    }
}
