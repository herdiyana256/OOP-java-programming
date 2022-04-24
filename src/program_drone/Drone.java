/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_drone;

/**
 *
 * @author User
 */
public class Drone {
    // Atributte
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;
    
    // Method
    void terbang() {
        energi --;
        if(energi > 10) {
            // Terbang berarti nilai ketinggian bertambah
            
            ketinggian++;
            System.out.println("Drone Terbang.....");
            
        } else {
            System.out.println("Energi Lemah: Drone tidak bisa Terbang, Captain!");
        }
    }
    void matikanMesin () {
        if(ketinggian > 0) {
            System.out.println("Mesin tidak bisa dimatikan karena sedang Terbang,Captain!");
        } else {
            System.out.println("Mesin dimatikan...");
        }
    }
    void turun() {
        // ketingian berkurang, karena turun 
        ketinggian--;
        energi --;
        System.out.println("Drone turun")
    }
    
    void belok () {
        energi --;
        System.out.println("Drone Belok");
        // Belok ke mana? perlu di check :*
        
        void maju () {
        energi--;
        System.out.println("Drone Maju ke depan");
        kecepatan++;
    }
        void mundur () {
        energi --;
        System.out.println("Done Mundur");
        kecepatan++;
    }
    }
    
}
