package org.example;

public class MyLinkedList {
    private Node start;
    private Node end;
    private int size;

    private  static class Node{
        Object value;
        Node previos;
        Node next;

        Node(Object value){
            this.value = value;
            this.previos = null;
            this.next = null;
        }
    }
    public void add(Object value){//додає елемент в кінець
        Node newNode = new Node(value);
        if(start == null){
            start = newNode;
            end = newNode;
        }else{
            end.next = newNode;
            newNode.previos = end;
            end = newNode;
        }
        size++;
    }
    public  void remove(int index){//видаляє елемент із вказаним індексом
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Неправильний індекс");
        }
        Node current = start;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if(current.previos == null){
            start = current.next;
//            current.next.previos = null;
        }else{
//            current.previos.next = current.next;
            current.previos.next = current.next
            ;
        }
        if(current.next == null){
            end = current.previos;
        }else{
            current.next.previos = current.previos;
        }
        size--;
    }
    public void clear(){
        start = null;
        end = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public Object get(int index){//повертає елемент за індексом
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Неправильний індекс");
        }
        Node current = start;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }
    public  void display(){
        Node current = start;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
