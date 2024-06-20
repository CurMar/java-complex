package net.curmar.jvl;

import java.util.ArrayList;
import java.util.Comparator;

class EnemyComparator implements Comparator<Enemy> {

    public static final EnemyComparator INSTANCE = new EnemyComparator();

    @Override
    public int compare(Enemy a, Enemy b) {
        return (100 * a.damage + 10 * a.health + a.protection) - (100 * b.damage + 10 * b.health + b.protection);
    }
}

class Enemy {

    public int damage, health, protection;

    Enemy(int a, int b, int c) {
        damage = a;
        health = b;
        protection = c;
    }
}


public class Main {

    public static void main(String[] args) {
        ArrayList<Enemy> a = new ArrayList<>();
        a.add(new Enemy(5, 3, 1));
        a.add(new Enemy(9, 9, 1));
        a.add(new Enemy(5, 2, 1));
        a.sort(EnemyComparator.INSTANCE);
        for (Enemy e : a)
            System.out.println(e.health);
    }
}