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
public class Player {
    // Definisi Atribute
    
    String name;
    int speed;
    int healthPoint;
    
    // Definisi Method RUN
    void run() {
        System.out.println(name +" running..........");
        System.out.println("Speed: "+  speed);
    }
    
    // Definisi method isDead untuk mengecek nilai kesehatan (healthPoint)
    boolean isDead () {
        if(healthPoint <= 0) return true;
        return false;
    }
}
