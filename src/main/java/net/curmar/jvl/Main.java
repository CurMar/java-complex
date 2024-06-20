package net.curmar.jvl;

import java.util.ArrayList;
import java.util.Collections;

class Enemy implements Comparable<Enemy> {

    public int damage, health, protection;

    Enemy(int a, int b, int c) {
        damage = a;
        health = b;
        protection = c;
    }

    @Override
    public int compareTo(Enemy e) {
        return (100 * damage + 10 * health + protection) - (100 * e.damage + 10 * e.health + e.protection);
    }
}


public class Main {


    public static void main(String[] args) {
        ArrayList<Enemy> a = new ArrayList<>();
        a.add(new Enemy(5, 3, 1));
        a.add(new Enemy(9, 9, 1));
        a.add(new Enemy(5, 2, 1));
        Collections.sort(a);
        for (Enemy e : a)
            System.out.println(e.health);
    }
}