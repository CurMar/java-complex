package net.curmar.jvl;

import java.util.ArrayDeque;


public class Main {
    static ArrayDeque<String> tasks = new ArrayDeque<>();

    public static void main(String[] args) {
        System.out.println("START");
        tasks.add("Do first.");
        tasks.add("Do second");
        tasks.add("Task 3");

            System.out.println(tasks.peekLast());

    }
}