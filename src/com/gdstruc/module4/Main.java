package com.gdstruc.module4;

public class Main {
    public static void main(String[] args) {

        ArrayQueue arrayQueue = new ArrayQueue(10);

        arrayQueue.enqueue(new Player(10,"Jayce",30));
        arrayQueue.enqueue(new Player(9,"Jinx",28));
        arrayQueue.enqueue(new Player(8,"Lux",25));
        arrayQueue.enqueue(new Player(7,"Teemo",23));
        arrayQueue.enqueue(new Player(6,"Vi",21));
        arrayQueue.enqueue(new Player(5,"Ez",20));
        arrayQueue.enqueue(new Player(4,"Jax",18));
        arrayQueue.enqueue(new Player(3,"Vanz",16));
        arrayQueue.enqueue(new Player(2,"Udyr",10));
        arrayQueue.enqueue(new Player(1,"Caitlyn",5));



        System.out.println("Turn 1: ");


        System.out.println("List of Players: ");
        arrayQueue.printQueue();

        System.out.println("==========================");
        System.out.println("=== GAME START ===");



        Player removedPlayer1 = arrayQueue.dequeue();
        Player removedPlayer2 = arrayQueue.dequeue();
        Player removedPlayer3 = arrayQueue.dequeue();
        Player removedPlayer4 = arrayQueue.dequeue();
        Player removedPlayer5 = arrayQueue.dequeue();

        System.out.println("Current Players in Queue: ");
        arrayQueue.printQueue();




    }
}