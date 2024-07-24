package org.example;

public class MyLinkedList {
    private Node nods;
    private int size;

    private  static class Node{
        Object value;
        Node next;

        Node(Object value){
            this.value = value;
            this.next = null;
        }
    }
    public void add(Object value){
        Node newNode = new Node(value);
        if(nods == null){
            nods = newNode;
        }else{
            Node current = nods;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    public  void remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Неправильний індекс");
        }
        if(index == 0){
            nods = nods.next;
        }else{
            Node current = nods;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }
    public void clear(){
        nods = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public Object get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Неправильний індекс");
        }
        Node current = nods;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }
    public  void display(){
        Node current = nods;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
