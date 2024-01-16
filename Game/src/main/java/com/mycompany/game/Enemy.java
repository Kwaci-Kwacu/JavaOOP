
package com.mycompany.game;

public class Enemy {
    //Atribut
    String name;
    int speed,healthpoin,damage,armor;
    
    
    //Method
    void attack(){
        healthpoin--;
        if (healthpoin<damage) {
            System.out.println("kerusakan "+healthpoin);
        }
        System.out.println("is attacking ..."+damage);
        
        
    }
    void defense(){
        System.out.println("Armor defense is ..."+armor);
        healthpoin++;
    }
    void run(){
        System.out.println("is running ...");
        System.out.println("Speed "+speed);
    }
    boolean isDead(){
        if(healthpoin<=0)return true;
        return false;
    }
}
