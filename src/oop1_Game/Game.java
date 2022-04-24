/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1_Game;

/**
 *
 * @author User
 */
public class Game {
        public static void main (String[] args){
        
        //Membuat Object Player
        Player hero = new Player();
        
        hero.name = "Si Pitung";
        hero.speed = 78;
        hero.healthPoint = 100;
        
        
        // Menjalankan Method
        hero.run() ;
        
        
        if(hero.isDead()) {
            System.out.println("Game Over");
        }
    }
    
}

