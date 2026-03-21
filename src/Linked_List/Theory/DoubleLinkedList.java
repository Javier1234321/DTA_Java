package Linked_List.Theory;

public class DoubleLinkedList<E>{
    public static class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;
        public Node(E e, Node<E> p, Node<E> n){
            element=e;
            prev=p;
            next=n;
        }
        public E getElement(){return element;}
        public Node<E> getNext(){return next;}
        public Node<E> getPrev(){return prev;}
        public void setNext(Node<E> n){next=n;}
        public void setPrev(Node<E> p){prev=p;}
    }
    Node<E> header;
    Node<E> trailer;
    int size=0;

    public DoubleLinkedList(){
        header =new Node<>(null,null, null);
        trailer=new Node<>(null, header, null);
        header.setNext(trailer);
    }
    public int getSize(){return size;}
    public boolean isEmpty(){return size==0;}

    public Node<E> getFirst(){
        if (header.getNext()==null){
            return null;
        }
        return header.getNext();
    }
    public Node<E> getLast(){
        if (trailer.getPrev()==null){
            return null;
        }
        return trailer.getPrev();
    }
    public void addFirst(E element){
        addBetween(element, header, header.getNext());
    }
    public void addLast(E element){
        addBetween(element,trailer.getPrev(),trailer);
    }


    public void addBetween(E element, Node<E> prev,Node<E> next){
        Node<E> newest= new Node<>(element,prev,next);
        prev.setNext(newest);
        next.setPrev(newest);
        size++;
    }

    public void traverseList(){
        DoubleLinkedList.Node<E> temp= header.getNext();
        while(temp!=null){
            System.out.print("|"+temp.getElement()+"|");
            temp=temp.getNext();
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> doubleLinkedList=new DoubleLinkedList<Integer>();
        doubleLinkedList.addFirst(1);
        doubleLinkedList.addFirst(2);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(4);
        doubleLinkedList.addFirst(5);
        doubleLinkedList.addFirst(6);
        doubleLinkedList.traverseList();
    }
}
