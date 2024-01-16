
package com.mycompany.game;


public class Game {

    public static void main(String[] args) {
        //objek
        Player Hero = new Player();
        Enemy Enemy = new Enemy();
        
        //mamberi nilai atribut
        Hero.name = "Ata";
        Hero.speed = 20;
        Hero.healthpoin = 100;
        Hero.damage = 400;
        Hero.armor =33;
        
        Enemy.name = "Monster";
        Enemy.healthpoin = 400;
        Enemy.damage =100;
        Enemy.armor =25;
        
        Hero.run();
        Hero.attack();
        Enemy.defense();
        
        //methot
        if(Hero.isDead()){
            System.out.println(Hero.name+"Is Dead, Game Over :( ");
        }
        if(Enemy.isDead()){
            System.out.println(Enemy.name+"Is Dead, Game Over :( ");
        }
       
        
    }
}
