package org.example;

public class Main {
    public static void main(String[] args) {
MyLinkedList list = new MyLinkedList();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.display();
        System.out.println("Size: " + list.size());
        System.out.println("Видалення елементу index = 2");
        list.remove(2);
        list.display();
        System.out.println("Size: " + list.size());
        System.out.println("Отримати елемент index = 3");
        System.out.println("Елемент index 3: " + list.get(3));
        System.out.println("Очищення колекції");
        list.clear();
        System.out.println("Size: " + list.size());




    }
}