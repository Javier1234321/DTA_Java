package Linked_List.Theory;

import java.util.Objects;

public class SinglyLinkedList<E> {
    private static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n){
            element=e;
            next=n;
        }
        public E getElement(){return element;}
        public Node<E> getNext(){return next;}
        public void setNext(Node<E>  n){next=n;}
    }

    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=0;
    public SinglyLinkedList(){};

    public int size(){return size;}
    public boolean isEmpty(){return size==0;}
    public E first(){
        if(isEmpty()) return null;
        return head.getElement();
    }

    public E last(){
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E e){
        head=new Node<>(e,head);
        if (size==0){
            tail=head;
        }
        size++;
    }

    public void addLast(E e){
        Node<E> newest=new Node<>(e,null);
        if (isEmpty()){
            head=newest;
        }else{
            tail.setNext(newest);
        }
        tail=newest;
        size++;
    }

    public void traverseList(){
        Node<E> temp=head;
        while(temp!=null){
            System.out.print("|"+temp.getElement()+"|");
            temp=temp.getNext();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o==null) return false;
        if (getClass()!=o.getClass()) return false;
        SinglyLinkedList other =(SinglyLinkedList) o;
        if (size!=other.size)return false;
        Node walkA=head;
        Node walkB=other.head;
        while(walkA!=null){
            if (!walkA.getElement().equals(walkB.getElement())) return false;
            walkA=walkA.getNext();
            walkB=walkB.getNext();
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, tail, size);
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> linkedList= new SinglyLinkedList<Integer>();
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.traverseList();
        SinglyLinkedList<Integer> linkedList2= new SinglyLinkedList<Integer>();
        System.out.println(linkedList.equals(linkedList2));
    }
}
