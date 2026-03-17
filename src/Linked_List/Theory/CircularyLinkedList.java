package Linked_List.Theory;

public class CircularyLinkedList<E> {
    private static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E element, Node<E> next){
            this.element=element;
            this.next=next;
        }
        public E getElement(){return element;}
        public Node<E> getNext(){return next;}
        public void setNext(Node<E> next){this.next=next;}
    }
    Node<E> tail=null;
    int size=0;

    public CircularyLinkedList(){}

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void rotate(){
        if (tail!=null){
            tail=tail.getNext();
        }
    }
    public void addFirst(E element){
        if (tail==null){
            tail=new Node<>(element, null);
            tail.setNext(tail);
        }
        else{
            Node<E> newest=new Node<>(element,tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }
    public void addLast(E element){
       addFirst(element);
       tail=tail.getNext();
    }
    public E removeFirst(){
        if (isEmpty()){return null;}
        Node<E> head=tail.getNext();
        if (head==tail){return null;}
        else{
            tail.setNext(head.getNext());
        }
        size--;
        return head.getElement();
    }
    public void traverseList() {
        int i=0;
        if (isEmpty()) {
            System.out.println("La lista está vacía");
            return;
        }
        Node<E> current = tail.getNext();
        Node<E> startNode = current;
        do {
            System.out.print("|" + current.getElement() + "|");
            current = current.getNext();
            i++;
        } while (size+5 > i);

        System.out.println();

    }
    public static void main(String[] args) {
        CircularyLinkedList<Integer> list=new CircularyLinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.traverseList();
    }
}
