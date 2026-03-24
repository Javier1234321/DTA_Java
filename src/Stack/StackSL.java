package Stack;

import Linked_List.Theory.SinglyLinkedList;

public class StackSL<E> implements Stack<E> {
    SinglyLinkedList<E> list=new SinglyLinkedList<>();
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        list.removeFirst();
        return list.first();
    }

    public void transverser(){
        list.traverseList();
    }

    public static void main(String[] args) {
        StackSL<Integer> stack=new StackSL<Integer>();
        stack.push(3);
        stack.push(5);
        stack.push(6);
        stack.transverser();
        stack.pop();
        stack.pop();
        System.out.println("");
        stack.transverser();
    }
}
